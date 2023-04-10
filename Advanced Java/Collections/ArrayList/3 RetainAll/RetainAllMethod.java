import java.util.ArrayList;
import java.util.Iterator;

public class RetainAllMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(60);
        // removes all the elements from list 1 which are not in list 2
        // which is similar to intersection
        list1.retainAll(list2);
        Iterator<Integer> itr = list1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() +" ");
        }
    }
}