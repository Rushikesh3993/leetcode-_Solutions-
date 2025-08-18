public class Rev_integer {

    /**
     * This method reverses the digits of an integer.
     * If reversing the number causes overflow, it returns 0.
     *
     * @param n the integer to reverse
     * @return the reversed integer or 0 if it overflows
     */
    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            // Extract the last digit
            int ldg = n % 10;

            // Remove the last digit from n
            n = n / 10;

            // Check for overflow before multiplying by 10
            // Integer.MAX_VALUE = 2147483647
            // If rev > 214748364, multiplying by 10 will overflow
            // If rev == 214748364 and ldg > 7, it will also overflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && ldg > 7)) {
                return 0;
            }

            // Check for underflow before multiplying by 10
            // Integer.MIN_VALUE = -2147483648
            // If rev < -214748364, multiplying by 10 will underflow
            // If rev == -214748364 and ldg < -8, it will also underflow
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && ldg < -8)) {
                return 0;
            }

            // Build the reversed number
            rev = rev * 10 + ldg;
        }

        return rev;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverse(123));        // Expected: 321
        System.out.println(reverse(-123));       // Expected: -321
        System.out.println(reverse(0));          // Expected: 0
        System.out.println(reverse(1534236469)); // Expected: 0 (overflow case)
    }
}
