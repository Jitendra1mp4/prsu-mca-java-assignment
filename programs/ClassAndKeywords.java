interface movable {
    void breakDown() ;
    void speedUp() ;
}


abstract sealed class Vehicle implements movable permits Bike, BiCycle{
    public void breakDown(){
        System.out.println("\nslowing down the speed!") ;
    }

    public void speedUp(){
        System.out.println("\nuplifting speed!");
    }

    abstract void start() ;
}

final class BiCycle extends Vehicle{
    void start(){
        System.out.println("give it a first paddle!");
    }
}

non-sealed class Bike extends Vehicle{
    // it is important to make it non-sealed, sealed or final
    void start(){
        System.out.println("Started engine");
    }
}


// class someThing extends Vehicle {
// this is not allowed as the class Vehicle does not permits someThing
// }
class SomeThingElse extends Bike{
    // it is allowed to do so
}


public class ClassAndKeywords {
    public static void main(String[] args) {
       Bike b = new Bike() ;
       BiCycle b1 = new BiCycle() ;
       b1.speedUp(); 
       b.breakDown(); 
       b1.speedUp(); 
       b.breakDown(); 
    }
}