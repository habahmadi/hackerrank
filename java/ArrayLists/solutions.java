package Java.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class solutions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        // Read and store lines
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < a; j++) {
                line.add(scan.nextInt());
            }
            lines.add(line);
        }

        // Process queries
        int numQueries = scan.nextInt();
        for (int i = 0; i < numQueries; i++) {
            int x = scan.nextInt() - 1; // Adjusting for 1-based indexing
            int y = scan.nextInt() - 1;

            // Check if x is a valid line index
            if (x >= 0 && x < lines.size()) {
                ArrayList<Integer> currentLine = lines.get(x);

                // Check if y is a valid position index within the line
                if (y >= 0 && y < currentLine.size()) {
                    System.out.println(currentLine.get(y));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}
