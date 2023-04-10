import java.util.*;

public class NormalQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(5);
        q.add(2);
        q.add(10);
        q.add(4);
        q.add(7);

        Iterator<Integer> iter = q.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
    }
}
