class Demo {

    void display() {

        synchronized(this) {
            System.out.println("Synchronized block executed");
        }
    }
}

public class Exp76_SynchronizedBlock {

    public static void main(String[] args) {

        Demo d = new Demo();
        d.display();
    }
}