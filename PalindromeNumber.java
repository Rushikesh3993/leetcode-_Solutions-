// Problem: Palindrome Number (LeetCode)
// Language: Java
// Date: 14 Aug 2025


public class PalindromeNumber {
    
    
    public static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(x > 0){
            int ldg = x % 10;
            rev = rev * 10 + ldg;
            x = x / 10;
        }

        if(temp ==  rev){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
          return temp == rev; 

    }

    public static void main(String  []args){

        System.out.println(isPalindrome(121));
    }
}

