//Q28. Write a program to show concept of multiple inheritance through implementation of interfaces in a class.

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

public class Q28 implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method from Interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method from Interface B");
    }

    public static void main(String[] args) {
        Q28 obj = new Q28();
        obj.methodA(); 
        obj.methodB(); 
    }
}
