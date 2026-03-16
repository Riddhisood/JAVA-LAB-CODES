class ThreadDemo extends Thread {

    public void run() {

        for(int i=1;i<=5;i++) {

            System.out.println(i);

            try {
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}

public class Exp71_SleepYieldThread {

    public static void main(String[] args) {

        ThreadDemo t = new ThreadDemo();
        t.start();
    }
}