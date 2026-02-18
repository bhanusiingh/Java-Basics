//A constructor is a special method that is used to initialize objects. 
//A constructor have same name as class name and it is automatically called when an object is created. 
//You can not call a constructor directly.
// A constructor genrally use to assign initial values
// A constructor does not have a return type.
// Constructer are 3 types - Default constructor, Parameterized constructor, Non parameterized constructor
package constructors;

public class Vehicle {
    String brand;
    String model;
    int year;
    int registrationNumber;
    //constructor
    Vehicle(String brand, String model, int year, int registrationNumber){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.registrationNumber=registrationNumber;
        System.out.println("Constructor called for " + brand + " " + model);
    }
    void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Registration Number: " + registrationNumber);
    }
    public static void main(String[] args) {
        Vehicle v1= new Vehicle("Toyota", "Camry", 2020, 12345);
        v1.displayInfo();
        
        Vehicle v2= new Vehicle("Honda", "Civic", 2019, 67890);
        v2.displayInfo();
    }
}
