package p2;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/19
 * Time: 19:43
 */
public class DemoAccessModifier {
    public static void main(String[] args) {
        Student student = new Student();
//        student.grade = 20;
        // setter
        student.setGrade(3.9);
        System.out.println(student.getGrade()); // getter
    }
}
