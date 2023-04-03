import java.util.Scanner;

public class Main {
    private static int getFibonacciLastDigitFast(int n) {
        int array[] = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; ++i) {
            array[i] = array[i - 2] + array[i - 1];
        }
        return array[n] % 10;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitFast(n);
        System.out.println(c);
    }
}
