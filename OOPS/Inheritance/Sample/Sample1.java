class A{
    int i;
    A(){
        i = 1;
        System.out.println("HI A");
    }
    public void printA(){
        System.out.println(i);
    }
}

class B extends A{
    int j;
    B(){
        j = 2;
        System.out.println("HI B");
    }
    public void printB(){
        System.out.println(j);
    }
}
class C extends B{
    int k;
    C(){
        k = 3;
        System.out.println("HI C");
    }
    public void printC(){
        System.out.println(k);
    }
}
public class Sample1 {
    public static void main(String[] args) {
        C obj = new C();
        // obj.printA();
        // obj.printB();
        // obj.printC();
    }
}
