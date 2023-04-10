import java.util.*;

public class LinkedListInJava {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.remove(0);
        list.addFirst(1);
        Iterator<Integer> iter= list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}