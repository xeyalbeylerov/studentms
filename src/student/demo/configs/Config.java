package student.demo.configs;

import student.demo.beans.Student;
import student.demo.beans.Teacher;

import java.io.Serializable;
import java.util.HashMap;

public class Config implements Serializable{
    public static String filePath = "C:\\Users\\xeyal\\Desktop\\obj.txt";
    public static String username = "admin";
    public static String password = "admin";
    public static Student student;
    public static Teacher teacher = new Teacher(1, "Xeyal", "Beylerov", 22);
    public static HashMap<Integer, Student> studentsMap=new HashMap<>();
    public static HashMap<Integer, Teacher> teachersMap=new HashMap<>();
    ;


}
