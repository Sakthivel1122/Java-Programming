import java.util.*;

public class TreeSetInJava {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();

        // Treeset will save the data in a binary search tree
        tree.add(2);
        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(6);
        tree.add(5);

        Iterator<Integer> iter1 = tree.iterator();
        Iterator<Integer> iter2 = tree.descendingIterator();

        System.out.print("Ascending Iterator : ");
        while(iter1.hasNext()){
            System.out.print(iter1.next() + " ");
        }
        System.out.print("\nDescending Iterator: ");
        while(iter2.hasNext()){
            System.out.print(iter2.next() + " ");
        }

        System.out.println("\n\nHead Set: " + tree.headSet(3,true));
        System.out.println("Tail Set: " + tree.tailSet(3,true));
        System.out.println("Sub Set: " + tree.subSet(1,false,5,true));
        System.out.println("Decreasing Set: " + tree.descendingSet());
        System.out.println();
    }
}
