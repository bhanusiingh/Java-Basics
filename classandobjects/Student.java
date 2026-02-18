package classandobjects;
public class Student {
    int id;
    String name;
    int marks;
    public static void main(String[] args) {
        //creating object
        Student s1= new Student();
        s1.id=1;
        s1.name="John";
        s1.marks=85;
        System.out.println(s1.id + " " + s1.name + " " + s1.marks);
        
        
        Student s2= new Student();
        s2.id=2;
        s2.name="ane";
        s2.marks=90;
        System.out.println(s2.id + " " + s2.name + " " + s2.marks);
        

    }
}
