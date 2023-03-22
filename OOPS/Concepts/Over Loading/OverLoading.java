class Adder{
    static int add(int x,int y){
        return x + y;
    }
    static int add(int x,int y,int z){
        return x + y + z;
    }
    static double add(double x,double y,double z){
        return x + y + z;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        System.out.println(Adder.add(1, 2));
        System.out.println(Adder.add(1, 2,3));
        System.out.println(Adder.add((double)1, (double)3, (double)3));
    }
    public static void main(String args) {
        System.out.println(Adder.add((double)1, (double)3, (double)3));
        System.out.println(Adder.add(1, 2,3));
        System.out.println(Adder.add(1, 2));
    }
}
