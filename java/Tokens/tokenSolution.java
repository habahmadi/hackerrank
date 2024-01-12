package Java.Tokens;

import java.util.*;

public class tokenSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        
        String[] tokens = s.split("[ !,?._'@]+");
        
        int tokenCount = 0;
        
        ArrayList<String> resultTokens = new ArrayList<String>();

        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokenCount++;
                resultTokens.add(token);
            }
        }

        System.out.println(tokenCount);
        resultTokens.forEach(System.out::println);
        scan.close();
    }
}

