package Java.InheritanceII;

class Arithmetic {
    int add(int num1, int num2) {
        return num1 + num2;
    }
}

class Adder extends Arithmetic {
}

public class inheritanceII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        
      System.out.println(adder.add(10, 32) + " " + adder.add(10, 3) + " " + adder.add(10, 10));
        
    }
}

