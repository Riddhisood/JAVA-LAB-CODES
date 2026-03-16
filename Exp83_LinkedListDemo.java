import java.util.*;

public class Exp83_LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(10);
        list.add(20);
        list.addLast(30);

        list.remove(Integer.valueOf(20));

        System.out.println(list);
    }
}