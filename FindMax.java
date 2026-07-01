import java.util.Scanner;
public class Findmax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Basic validation to ensure a usable array size
        while (size <= 0) {
            System.out.print("Array size must be greater than 0. Please enter a valid size: ");
            size = scanner.nextInt();
        }

        // Step 2: Create the array
        int[] numbers = new int[size];

        // Step 3: Collect array elements from the user
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Search for the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 5: Display the results
        System.out.println("\n----- Results -----");
        System.out.println("Array Entered     : " + arrayToString(numbers));
        System.out.println("Maximum Value      : " + maxValue);
        System.out.println("Index of Maximum   : " + maxIndex);

        scanner.close();
    }


    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
