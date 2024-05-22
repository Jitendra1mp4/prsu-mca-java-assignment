import myPack.Intro;

class ParentClass {
    void displayParent() {
        System.out.println("Parent class method");
    }
}

class ChildClass extends ParentClass {
    void displayChild() {
        System.out.println("Child class method");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Intro.print("Single Inheritance");
        // Single inheritance demonstration
        ChildClass obj = new ChildClass();
        obj.displayParent();
        obj.displayChild();
    }

}