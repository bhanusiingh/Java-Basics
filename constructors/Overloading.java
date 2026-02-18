package constructors;

public class Overloading {
    String brand;
    String model;
    int year;
    int registrationNumber;
    //constructor overloading - multiple constructors with different parameters
    Overloading(String brand, String model, int year, int registrationNumber){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.registrationNumber=registrationNumber;
        System.out.println("Constructor called for " + brand + " " + model);
    }
    Overloading(String brand, String model){
        this.brand=brand;
        this.model=model;
        System.out.println("Constructor called for " + brand + " " + model);
    }
    Overloading(String brand){
        this.brand=brand;
        System.out.println("Constructor called for " + brand);
    }
    public static void main(String[] args) {
        Overloading v1= new Overloading("Toyota", "Camry", 2020, 12345);
        Overloading v2= new Overloading("Honda", "Civic");
        Overloading v3= new Overloading("Ford");
    }                           
}
