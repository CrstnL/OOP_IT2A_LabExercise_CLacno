public class Exer1_Functional {
    public static void main(String[] args) {
        //Double the numbers in an array and sum them

        int[] numbers = {1, 2, 3, 4, 5};

        // Functional style using streams
        int sum = java.util.Arrays.stream(numbers)  
                                  .map(n -> n * 2) 
                                  .sum();          

        System.out.println("Sum of doubled numbers: " + sum);
    }
}



