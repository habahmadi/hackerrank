/* Use Sample Input:
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
 */

package Java.HashMap;

import java.util.*;

class hashmapSolution {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

