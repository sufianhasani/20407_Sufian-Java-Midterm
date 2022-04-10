package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     * Write a method that will print or return at least 40 Fibonacci numbers
     *
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
}

    public static void main(String[] args) {

        int n = 40;

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }}

