/* a static method named getSumNeighbours(int[] numbers) which takes an array of integers as a parameter. 
The method should return an array with the same number of elements as the original array, where each integer 
in the new array is the sum of itself and its neighboring elements in the original array. */

class getSumOfNeighbours{
    public static int[] getSumNeighbours(int[] numbers){
        int count = 0;
        int[] sumNeighbours = new int[numbers.length];
        for(int i : numbers){
            if(count == 0){sumNeighbours[count] = numbers[count] + numbers[count + 1];}
            else if(count == numbers.length - 1){sumNeighbours[count] = numbers[count] + numbers[count - 1];}
            else{sumNeighbours[count] = numbers[count - 1] + numbers[count] + numbers[count + 1];}
            count++;
        }
        return sumNeighbours;
    }

    public static void main(String[] args){
        int[] values = {10, 20, 30, 40, 50};
        int[] result = getSumNeighbours(values);
        System.out.println(java.util.Arrays.toString(values));
        System.out.println(java.util.Arrays.toString(result));
        System.out.println(java.util.Arrays.toString(getSumNeighbours(new int[]{1, 2, 3, 4})));
        System.out.println(java.util.Arrays.toString(getSumNeighbours(new int[]{10, 20})));
        System.out.println(java.util.Arrays.toString(getSumNeighbours(new int[]{1, 2, 3, 4, 5, 6, 7, 8 })));
    }
}