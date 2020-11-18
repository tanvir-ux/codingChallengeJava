public class FibonacciM {
    // declare a long array of size 100
    static long[] memo = new long[100];

    public static long F(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        // check if the result already exist
        if (memo[n] == 0) {
            // result not found so update the array
            memo[n] = F(n - 1) + F(n - 2);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(F(n));
    }
}
