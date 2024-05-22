import myPack.Intro;
import java.io.*;

public class CharacterCountFileDemo {
    public static void main(String[] args) {
        Intro.print("Count the numbers of Characters in a File");


        String filePath ="myFile.txt";

        File file = new File(filePath);
        int charCount = 0;

        try (FileReader fr = new FileReader(file)) {
            int character;
            while ((character = fr.read()) != -1) {
                charCount++;
            }

            System.out.println("Number of characters in the file: " + charCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
