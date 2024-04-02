import java.util.Scanner;

 class ArrayRotation {
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

        // Rotate the array to the left
        rotateLeft(array);

        // Print the rotated array
        System.out.println("\nArray after left rotation:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Method to rotate the array to the left by one position
    public static void rotateLeft(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No rotation needed for arrays with 0 or 1 element
        }

        int firstElement = arr[0]; // Store the first element
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // Shift each element to the left
        }
        arr[arr.length - 1] = firstElement; // Place the first element at the end
    }
}