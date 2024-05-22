import myPack.Intro;

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class TestClass implements Interface1, Interface2 {

    public void method1() {
        System.out.println("Method1 implementation");
    }

    public void method2() {
        System.out.println("Method2 implementation");
    }
}

public class MultipleInhritWithInf {
    public static void main(String[] args) {
        Intro.print("Multiple Inheritance through Interfaces");
        
        TestClass obj = new TestClass();
        obj.method1();
        obj.method2();
    }

}
