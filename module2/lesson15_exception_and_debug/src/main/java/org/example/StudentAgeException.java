package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/11
 * Time: 20:36
 */
public class StudentAgeException extends Exception {

    public StudentAgeException(String msg) {
        super(msg);
        System.out.println("StudentAgeException");
    }

}
