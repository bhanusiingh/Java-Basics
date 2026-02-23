//this keyword is used to refer to the current object.
//it means this refers to the objesct that is currently executing the code.
//we can use this keyword to refer to the current object, to call the current object's method, to call the current object's constructor, to pass the current.
// It also use to return the current object.
//it is also used ti pass curent object as a parameter to another method or constructor.
package thiskeyword;
public class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "A");
        student1.displayInfo();
    }
}
