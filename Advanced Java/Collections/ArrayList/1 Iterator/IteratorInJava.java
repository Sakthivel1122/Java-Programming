import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInJava {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() +" ");
        }
    }    
}
