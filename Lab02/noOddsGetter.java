/*  a static method named noOdds(int[] numbers) that takes an array of integers as a parameter. The method returns false if the parameter array contains any odd integers and returns true otherwise. */

class noOddsGetter{
    public static boolean noOdds(int[] numbers){
        for(int i : numbers){if(i % 2 == 1){return false;}}
        return true;
    }

    public static void main(String[] args){
        System.out.println(noOdds(new int[]{2, 3, 4, 5, 6}));
        System.out.println(noOdds(new int[]{2, 4, 6, 8}));
        System.out.println(noOdds(new int[]{100}));
    }
}