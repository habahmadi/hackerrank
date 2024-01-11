package Java.Anagrams;

import java.util.*;
import java.util.Arrays;

public class anagramSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
      
        // Convert both strings to lowercase for case-insensitive comparison
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if the lengths of both strings are the same
        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            scan.close();
            return;
        }
        
        // Convert the strings to character arrays
        char[] one = a.toCharArray();
        char[] two = b.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(one);
        Arrays.sort(two);
 
        // Check if the sorted arrays are equal
        if (Arrays.equals(one, two)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        scan.close();
    }
}



