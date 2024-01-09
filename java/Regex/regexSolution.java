import java.util.*;

public class regexSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline character
        
        // Define the regular expression pattern
        String regex = "[a-zA-Z][a-zA-Z0-9_]{7,29}";

        for (int i = 0; i < n; i++) {
            String username = scan.nextLine();
            
            // Check if the username matches the pattern
            if (username.matches(regex)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}
