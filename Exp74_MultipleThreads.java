class A extends Thread {

    public void run() {
        System.out.println("Thread A running");
    }
}

class B extends Thread {

    public void run() {
        System.out.println("Thread B running");
    }
}

public class Exp74_MultipleThreads {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}