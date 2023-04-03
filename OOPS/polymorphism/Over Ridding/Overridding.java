class A{
    public int increment(int num){
        return num+1;
    }
}
class B extends A{
    public int increment(int num){
        return num+2;
    }
}
public class Overridding {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new B();
        System.out.println(obj1.increment(1));
        System.out.println(obj2.increment(1));

        System.out.println(obj1.increment(1));
        // System.out.println(obj2.increment(2));
    }
}
