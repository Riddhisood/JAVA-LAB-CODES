class Table {

    synchronized void print(int n) {

        for(int i=1;i<=5;i++)
            System.out.println(n*i);
    }
}

public class Exp75_SynchronizedMethod {

    public static void main(String[] args) {

        Table t = new Table();
        t.print(5);
    }
}