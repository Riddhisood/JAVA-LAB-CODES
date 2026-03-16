class T1 extends Thread {

    public void run() {
        System.out.println("Thread running");
    }
}

public class Exp72_JoinThread {

    public static void main(String[] args) {

        try {

            T1 t = new T1();
            t.start();
            t.join();

            System.out.println("Main thread ends");
        }

        catch(Exception e){}
    }
}