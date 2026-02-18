package initialblocks;

public class Initialization {
    int a;

    {
        System.out.println("Instance initializer block called");
    }

    static {
        System.out.println("Static block called");
    }

    public Initialization() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        Initialization obj1 = new Initialization();
        System.out.println("-----");
        Initialization obj2 = new Initialization();
    }
}

