import java.util.Scanner;

 class FibonacciIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci series up to " + N + " terms: ");
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }
}
