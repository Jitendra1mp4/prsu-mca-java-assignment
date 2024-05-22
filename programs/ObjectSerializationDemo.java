import myPack.Intro;
import java.io.*;

class Person1 implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectSerializationDemo {
    public static void main(String[] args) {
        Intro.print("Object Serialization");

        Person1 person = new Person1("John Doe", 30);

        try (FileOutputStream fos = new FileOutputStream("person.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person);
            System.out.println("Object has been serialized");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream("person.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person1 deserializedPerson = (Person1) ois.readObject();
            System.out.println("Object has been deserialized");
            System.out.println("Name: " + deserializedPerson.name);
            System.out.println("Age: " + deserializedPerson.age);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
