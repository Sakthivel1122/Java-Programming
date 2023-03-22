class Shape{
    public void area(){
        System.out.println("Pass Arguments to get area");
    }
}
class Square extends Shape{
    public void area(int length){
        System.out.println(length*length);
    }
}
class Rectangle extends Square{
    public void area(int length,int breath){
        System.out.println(length*breath);
    }
}
public class Area{
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.area(10,5);
        obj.area(5);
        obj.area();
    }
}
