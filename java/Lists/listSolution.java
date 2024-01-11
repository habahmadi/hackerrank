package Java.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the number of integers in list
        int a = scan.nextInt();
        // Creating list
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            // Iterating and reading through the list
            num.add(scan.nextInt());
        }

        // Read the number of queries
        int numQueries = scan.nextInt();

        // Process queries
        for (int q = 0; q < numQueries; q++) {
            String queryType = scan.next();

            if (queryType.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                num.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = scan.nextInt();
                num.remove(index);
            }
        }
        // Modified List
        for (int i : num) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}

