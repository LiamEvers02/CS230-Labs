/* a static method named createArray(int maxValue) which takes a positive integer as a parameter and creates an array containing odd integers up to the specified value. */
class arrayCreator{
    public static int[] createArray(int maxValue){
        int[] newArray = maxValue % 2 == 0 ? new int[maxValue / 2] : new int[maxValue / 2 + 1];
        int counter = 0;
        for (int i = 1; i <= maxValue; i += 2){
            newArray[counter] = i;
            counter++;
        }
        return newArray;
    }

    public static void main(String[] args){
        int[] result = createArray(10);
        System.out.println(Arrays.toString(result));
        int[] result2 = createArray(11);
        System.out.println(Arrays.toString(result2));
    }
}