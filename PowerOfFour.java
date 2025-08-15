// Problem: Check if a number is a power of four
// Approach:
// 1. If the number is <= 0, it cannot be a power of four.
// 2. Keep dividing the number by 4 while it is greater than 1.
// 3. If at any step, the number is not divisible by 4 (remainder != 0), return false.
// 4. If we reach exactly 1, it means the number is a power of four.

public class PowerOfFour {
    // Method to check if n is a power of four
    public static boolean isPowerOfFour(int n) {
        // Step 1: Handle negative numbers and zero
        if (n <= 0) {
            return false;
        }

        // Step 2: Keep dividing by 4 until we reach 1 or find a remainder
        while (n > 1) {
            // If not divisible by 4, return false
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4; // Divide by 4
        }

        // Step 3: If we reached 1, it's a power of four
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerOfFour(16)); // true
        System.out.println(isPowerOfFour(64)); // true
        System.out.println(isPowerOfFour(8));  // false
        System.out.println(isPowerOfFour(1));  // true (4^0 = 1)
    }
}
