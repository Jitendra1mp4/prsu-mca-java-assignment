import myPack.Intro;

class GrandParentClass {
    void displayGrandParent() {
        System.out.println("GrandParent class method");
    }
}

class ParentClass extends GrandParentClass {
    void displayParent() {
        System.out.println("Parent class method");
    }
}

class ChildClass extends ParentClass {
    void displayChild() {
        System.out.println("Child class method");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Intro.print("Multilevel Inheritance");
        // Multilevel inheritance demonstration
        ChildClass obj = new ChildClass();
        obj.displayGrandParent();
        obj.displayParent();
        obj.displayChild();
    }

}
