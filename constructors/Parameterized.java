//Parameterized constructor - constructor that takes parameters to initialize the object.
package constructors;

public class Parameterized {
    String name;
    int age;
    String city;
    //parameterized constructor
    Parameterized(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
    public static void main(String[] args) {
        Parameterized p1= new Parameterized("Alice", 30, "New York");
        p1.displayInfo();
        
        Parameterized p2= new Parameterized("Bob", 25, "Los Angeles");
        p2.displayInfo();
    }
}
