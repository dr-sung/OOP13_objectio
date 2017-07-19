
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ObjectSerializationWriter {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 1, 3.24));
        students.add(new Student("Mary", 2, 3.99));
        students.add(new Student("Ben", 3, 2.45));
        students.add(new Student("Sue", 4, 2.85));
        students.add(new Student("Smith", 5, 1.85));

        ObjectOutputStream fileOut = null;
        try {
            fileOut = new ObjectOutputStream(new FileOutputStream("students.data"));
            fileOut.writeObject(students);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot create students.data file");
        } catch (IOException e) {
            System.out.println("Cannot write serialized objects");
        } finally {
            try {
                if (fileOut != null) {
                    fileOut.close();
                }
            } catch (IOException e) {
                System.out.println("Cannot close students.data");
            }
        }
    }
}