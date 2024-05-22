import myPack.Intro;
class ParentClass {
        void func1(){
            System.out.println("func1 one from parent");
        }

        void display() {
            System.out.println("Parent class method");
        }
    }
    
    class ChildClass extends ParentClass {
        @Override
        void display() {
            System.out.println("Child class method");
        }
    }

class MethodOverriding {
    public static void main(String[] args) {
        Intro.print("Method Overriding");
        // Method overriding demonstration
        ChildClass obj = new ChildClass();
        obj.func1();
        obj.display();
    }
    
    
}