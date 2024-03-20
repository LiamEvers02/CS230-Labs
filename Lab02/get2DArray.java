/*
 * Write a static method named generate2DArray(String word) which takes a String object as a parameter and returns an array of String objects in the following form:
 *
 * [ ["c", "ca", "cat"], ["c", "ca"], ["c"] ] 
 */
class get2DArray{
    public static String[][] generate2DArray(String word) {
        int length = word.length();
        String[][] result = new String[length][];
        for (int i = 0; i < length; i++) {
            result[i] = new String[length - i];
            for (int j = 0; j < length - i; j++) {
                result[i][j] = word.substring(0, j + 1);
            }
        }
        return result;
    }

    public static void main(String[] args){
        	
        String[][] result = generate2DArray("powerful");
        for (String[] array: result) System.out.println(Arrays.toString(array));
    }
}