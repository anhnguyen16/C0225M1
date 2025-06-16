package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/09
 * Time: 21:19
 */
public class AgeComparator implements java.util.Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // So sanh theo tuoi
        if (o1.getAge() < o2.getAge()) {
            return -1; // o1 < o2
        } else if (o1.getAge() > o2.getAge()) {
            return 1; // o1 > o2
        } else {
            return 0; // o1 == o2
        }
    }
}
