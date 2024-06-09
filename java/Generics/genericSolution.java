package Java.Generics;

public class genericSolution {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] numbers = {1, 2, 3};
        String[] words = {"Hello", "World"};

        printArray(numbers);
        printArray(words);
    }
}
