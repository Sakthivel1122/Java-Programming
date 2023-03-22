class ParentClass{
    int age;
    ParentClass(int age){
        this.age = age;
    }
    public void getAge(){
        System.out.println("Age is "+age);
    }
    public void display(){
        System.out.println("Displaying from ParentClass");
    }
}
class ChildClass extends ParentClass{
    ChildClass(int age){
        super(age);
    }
    public void display(){
        System.out.println("Displaying from ChildClass");
    }
    public void chlidmain(){
        ChildClass ch = new ChildClass(10);
        System.out.println(ch.age);
        System.out.println(super.age);
        ch.getAge();
        super.getAge();
        ch.display();
        super.display();
    }
}
public class SuperClass {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass(20);
        obj.getAge();
        obj.chlidmain();
    }
}
