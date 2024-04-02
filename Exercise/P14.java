import java.util.Scanner;

class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove duplicate elements
        int[] uniqueArray = removeDuplicates(array, size);

        // Print the array after removing duplicates
        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < uniqueArray.length; i++) {
            if (uniqueArray[i] != Integer.MIN_VALUE) {
                System.out.print(uniqueArray[i] + " ");
            }
        }

        scanner.close();
    }

    // Method to remove duplicate elements from an array
    public static int[] removeDuplicates(int[] arr, int size) {
        if (arr == null || size == 0) {
            return arr; // Return original array if it's empty or null
        }

        int[] tempArray = new int[size];
        for (int i = 0; i < size; i++) {
            tempArray[i] = arr[i];
        }

        // Mark duplicate elements as Integer.MIN_VALUE
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (tempArray[i] == tempArray[j]) {
                    tempArray[j] = Integer.MIN_VALUE;
                }
            }
        }

        return tempArray;
    }
}