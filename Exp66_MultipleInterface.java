interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Machine implements Printable, Scannable {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class Exp66_MultipleInterface {

    public static void main(String[] args) {

        Machine m = new Machine();
        m.print();
        m.scan();
    }
}