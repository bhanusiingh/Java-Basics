//Default constructor - constructor that does not take parameters to initialize the object.
package constructors;

public class Default {
    String name;
    int age;
    String city;
    //default constructor

    
    public static void main(String[] args) {
        Default d1= new Default();
        d1.name="Alice";
        d1.age=30;
        d1.city="New York";
        System.out.println("Name: " + d1.name);
        System.out.println("Age: " + d1.age);
        System.out.println("City: " + d1.city);
        
        Default d2= new Default();
        d2.name="Bob";
        d2.age=25;
        d2.city="Los Angeles";
        System.out.println("Name: " + d2.name);
        System.out.println("Age: " + d2.age);
        System.out.println("City: " + d2.city); 
    }
}
