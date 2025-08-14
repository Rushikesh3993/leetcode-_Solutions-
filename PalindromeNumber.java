// Problem: Palindrome Number (LeetCode)
// Language: Java
// Date: 14 Aug 2025

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        if(x < 0 ) return false;
        
        while (x > 0) {
            int ldg = x % 10;
            rev = rev * 10 + ldg;
            x = x / 10;
        }

       
        return temp == rev;

        // return temp == rev; is just a shorter way of writing:

        // if(temp == rev) {
        // return true;
        // } else {
        // return false;
        // }

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
}

// another way
// public class PalindromeNumber {

// public static boolean isPalindrome(int x) {
// if (x < 0) return false; // negative numbers are not palindrome
// int temp = x, rev = 0;
// while (x > 0) {
// rev = rev * 10 + x % 10;
// x /= 10;
// }
// return temp == rev;
// }

// public static void main(String[] args) {
// System.out.println(isPalindrome(121)); // prints true
// }
// }

/*
 * Approach:
 * 1. Store original number in 'temp'
 * 2. Reverse the number using modulus and division
 * 3. Compare reversed number with original
 * 4. Return true if equal, else false
 * Time Complexity: O(log10(n))
 * Space Complexity: O(1)
 */
