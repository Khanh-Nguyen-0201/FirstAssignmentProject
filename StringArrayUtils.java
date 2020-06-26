 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int n = array.length;
        return array[n-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int n = array.length;
        return array[n-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value)
            return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for(int i = 0; i < array.length/2;i++){
            String temp = array[i];
            array[i] = array[array.length - i-1];
            array[array.length-i-1] = temp;
        }
        return array;
        
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i < array.length/2;i++){
            String temp = array[i];
            if(array[i] != array[array.length - i - 1])
            return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean [] check = new boolean[26];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length(); j++){
                if(('A' <= array[i].charAt(j)) && (array[i].charAt(j) <= 'Z'))
                index = array[i].charAt(j) - 'A';
                else if(('a' <= array[i].charAt(j)) &&(array[i].charAt(j) <= 'z'))
                index = array[i].charAt(j) - 'a';
                else
                continue;
                check[index] = true;
            }
        }
        for(int i = 0; i < check.length; i++){
            if(check[i] == false)
            return false;
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value)
            sum++;
        }
        
        return sum;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String [] newArr = new String[array.length-1];
        for(int i = 0, j = 0; i < array.length; i++){
            if(array[i] == valueToRemove)
            continue;
            else
            newArr[j++] = array[i];
        }
        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int n = array.length;
        int j = 1;
        for(int i = 1; i < n; i++){
            if(array[i] != array[j-1]){
                j++;
                array[j++] = array[i];
            }
        }
        return array;
        
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int j = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] == array[j]){
                j++;
                String temp = array[i] + array[j];
                array[i] = temp;
            }
        }
        return array;
    }


}
