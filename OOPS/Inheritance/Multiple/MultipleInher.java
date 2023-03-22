interface infoA{
    public void printA();
}
interface infoB{
    public void printB();
}
class A implements infoA,infoB{
    public void printA(){
        System.out.println("Printing... A");
    }
    public void printB(){
        System.out.println("Printing... B");
    }
}
public class MultipleInher {
    public static void main(String[] args) {
        A obj = new A();
        obj.printA();
        obj.printB();
    }
}
