package Java.ReverseStr;


import java.util.*;

public class reverseSolution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true; // Assume it's a palindrome initially
        
        int len = A.length();
        
        for (int i = 0; i < len / 2; i++) {
            if (A.charAt(i) != A.charAt(len - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop early if a mismatch is found
            }
        }
        
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}



