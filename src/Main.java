import java.util.Scanner;

public class Main {

    public static int product(int[] array, int i) {
        /*
         * The purpose of this method is to calculate the product of each element in an array and return the result.
         * Requires an integer Array and an index "i" argument.
         * The method uses recursion to multiply and shrink each element of the array.
         * Finally, it returns the value of the first element of the array.
         */

        if (i == array.length - 1) {
            return array[i];
        } else {
            return array[i] * product(array, i + 1);
        }
    }

    public static void main(String[] args) {
        // Create scanner object to read input.
        Scanner sc = new Scanner(System.in);

        // Create Array to store numbers.
        int[] intArray = new int[5];

        // Prompt user for 5 integers, add them to the intArray.
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            intArray[i] = sc.nextInt();
        }

        // Call the product method, passing intArray and 0 as arguments, store result in new variable named "solution".
        int solution = product(intArray, 0);

        // print out the solution.
        System.out.println("The product of the entered numbers is: " + solution);
    }
}