package Java.Inheritance;

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
    
    void fly() {
        System.out.println("I am flying");
    }
}

class Bird extends Animal {
    void sing() {
        System.out.println("I am singing");
    }
}
public class inheritanceSol {
    public static void main(String[] args) {
        
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
