package Java.Hashset;

import java.util.*;

public class hashSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        HashSet<String> names = new HashSet<String>();
        int a = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < a; i++) {
            String input = scan.nextLine();
            names.add(input);
            System.out.println(names.size());
        }
        scan.close();
    }
}
