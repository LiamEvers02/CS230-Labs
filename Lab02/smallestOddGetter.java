/*  a static method named getIndexOfSmallestOdd(int[] numbers) that takes an array of integers as a parameter and returns the index of the smallest odd element in the array.  */
class smallestOddGetter{
    public static int getIndexOfSmallestOdd(int[] numbers){
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 1 && numbers[i] <= minValue){
                minValue = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
        
    }

    public static void main(String[] args){
        int[] numbers = new int[]{51, 65, 66, 11, 80, 10, 9};
        System.out.print(getIndexOfSmallestOdd(numbers));
        int[] numbers2 = new int[]{};
        System.out.print(getIndexOfSmallestOdd(numbers2));
    }
}