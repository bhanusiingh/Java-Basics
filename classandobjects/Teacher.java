package classandobjects;

public class Teacher {
    int id;
    int salary;
    String name;
    String subject;
    void toTeach(){
        System.out.println(name + " is teaching " + subject);
    }
    public static void main(String[] args) {
        //creating object
        Teacher t1= new Teacher();
        t1.id=111;
        t1.name="Mr. Ravi";
        t1.subject="Mathematics";
        t1.salary=50000;
        System.out.println(t1.id + " " + t1.name + " " + t1.subject);
        
        
        Teacher t2= new Teacher();
        t2.id=222;
        t2.name="Ms. Anu";
        t2.subject="English";
        t2.salary=75000;
        System.out.println(t2.id + " " + t2.name + " " + t2.subject);
        t1.toTeach();
        t2.toTeach();

    }
}
