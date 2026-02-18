// Non Parameterized constructor - constructor that does not take parameters to initialize the object.
package constructors;

public class NonParameterized {
    String name;
    int age;
    String city;
    //non parameterized constructor
    NonParameterized(){
        name="Alice";
        age=30;
        city="New York";
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
    public static void main(String[] args) {
        NonParameterized np1= new NonParameterized();
        np1.displayInfo();
        
        NonParameterized np2= new NonParameterized();
        np2.displayInfo();
    }
}
