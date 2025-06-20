package vn.codegym.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/18
 * Time: 20:56
 */
public class StudentDemo {
    public static void main(String[] args) {
        try {
//            Student student = new Student(1, "Nguyen Duc Hai", 20);
//            writeStudent(student);

            Student std = readStudent();
            System.out.println(std);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeStudent(Student student) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
        oos.writeObject(student);

        oos.close();
    }

    public static Student readStudent() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));
        Student student = (Student) ois.readObject();
        return student;
    }
}
