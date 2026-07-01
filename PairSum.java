import java.util.Scanner;
public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        while (size <= 1) {
            System.out.print("Array size must be at least 2 to form a pair. Please enter a valid size: ");
            size = scanner.nextInt();
        }

        // Step 2: Create the array and collect elements
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute force (nested loop) search for a matching pair
        boolean found = false;

        for (int i = 0; i < numbers.length && !found; i++) {
            for (int j = i + 1; j < numbers.length && !found; j++) {
                if (numbers[i] + numbers[j] == target) {
                    // Step 5: Display the pair that was found
                    System.out.println("\n----- Pair Found -----");
                    System.out.println("Index 1 : " + i + "  -> Value: " + numbers[i]);
                    System.out.println("Index 2 : " + j + "  -> Value: " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                }
            }
        }

        // Step 6: Handle the case where no pair exists
        if (!found) {
            System.out.println("\nNo pair of numbers in the array sums to " + target + ".");
        }

        scanner.close();
    }
}
