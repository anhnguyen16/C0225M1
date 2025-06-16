package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/09
 * Time: 21:12
 */
// Danh dau lop nay co the sap xep mac dinh dua tren tieu chi gi do
public class Student implements Comparable<Student> {
    private String name;
    private int grade;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        // So sanh theo diem
        if (this.grade < o.grade) {
            return -1; // this < o
        } else if (this.grade > o.grade) {
            return 1; // this > o
        } else {
            return 0; // this == o
        }
    }
}
