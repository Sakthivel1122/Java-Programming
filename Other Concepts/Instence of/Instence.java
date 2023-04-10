class ParentClass{

}
public class Instence extends ParentClass{
    public static void main(String[] args) {
        Instence i = new Instence();
        System.out.println(i instanceof Instence);
        System.out.println(i instanceof ParentClass);
    }
}
