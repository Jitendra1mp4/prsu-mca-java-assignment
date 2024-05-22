import myPack.Intro ;

class Person{
    String name ;
    int age;
    Person(String name, int age){
        this.name = name ;
        this.age = age ;
    }

    void show(){
        System.out.println("Person name : "+name) ;
        System.out.println("Person age : "+age) ;
    }

    void eat(){
        System.out.println(name + " is eating rice and curry");
    }
}


public class ClassesAndObject{
    public static void main(String args[]){
        
        Intro.print("Demonstration of classes and object");
        
            Person a = new Person("Jitendra Kumar", 22) ;
            Person b = new Person("Purusottam", 21) ;

            a.show();
            a.eat();
            System.out.println();
            b.show();
            b.eat() ;
    }
}