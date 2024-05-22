import myPack.Intro;

class DemoConstOverloading {
    // Constructor overloading
    DemoConstOverloading() {
        System.out.println("Default constructor");
    }
    
    DemoConstOverloading(int x) {
        System.out.println("Parameterized constructor with one parameter: " + x);
    }
    
    DemoConstOverloading(int x, String str) {
        System.out.println("Parameterized constructor with two parameters: " + x + ", " + str);
    }
}


public class ConstructorOverloading {
    public static void main(String[] args) {
        Intro.print("Constructor Overloading demonstration");

        DemoConstOverloading obj1 = new DemoConstOverloading();
        DemoConstOverloading obj2 = new DemoConstOverloading(5);
        DemoConstOverloading obj3 = new DemoConstOverloading(5, "Hello");
    }
    
}

