import myPack.Intro;

class ParentClass {
    void display() {
        System.out.println("Parent class method");
    }
}
class ChildClass extends ParentClass {
    void display() {
        super.display(); // Calls the parent class method
        System.out.println("Child class method");
    }
}
public class SuperAndThisKeyword {
    public static void main(String[] args) {
        Intro.print("Super and This Keyword demonstration");
        ChildClass obj = new ChildClass();
        obj.display();
    }

}