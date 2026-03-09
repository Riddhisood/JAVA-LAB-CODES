//Q50. Create an interface with a default method and override it in the implementing class. 

interface DefaultMethodInterface {
    default void defaultMethod() {
        System.out.println("This is a default method in the interface.");
    }
}

public class Q50 implements DefaultMethodInterface {
    @Override
    public void defaultMethod() {
        System.out.println("This is the overridden default method in the implementing class.");
    }

    public static void main(String[] args) {
        Q50 example = new Q50();
        example.defaultMethod(); // Output: This is the overridden default method in the implementing class.
    }
}

