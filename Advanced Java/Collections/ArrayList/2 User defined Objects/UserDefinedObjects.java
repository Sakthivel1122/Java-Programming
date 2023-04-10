import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int regNo;
    String name;
    String dept;
    Student(int sRegNo,String sName,String sDept){
        this.regNo = sRegNo;
        this.name = sName;
        this.dept = sDept;
    }
}
public class UserDefinedObjects {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Spidy", "CSE");
        Student s2 = new Student(2, "Tony", "IT");
        Student s3 = new Student(3, "Caption", "AIDS");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student st = itr.next();
            System.out.println(st.regNo + " " + st.name + " " + st.dept);
        }
    }
}
