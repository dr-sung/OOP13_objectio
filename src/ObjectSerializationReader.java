
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectSerializationReader {

    public static void main(String[] args) {

        ObjectInputStream fileIn = null;
        ArrayList<Student> students = null;

        try {
            fileIn = new ObjectInputStream(new FileInputStream("students.data"));
            students = (ArrayList<Student>) fileIn.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open students.data file");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found in students.data serialized file");
        } catch (IOException e) {
            System.out.println("Cannot read serialized objects");
        } finally {
            try {
                if (fileIn != null) {
                    fileIn.close();
                }
            } catch (IOException e) {
                System.out.println("Cannot close students.data");
            }
        }

        for (Student s : students) {
            System.out.println(s); // call toString()
        }

    }
}
