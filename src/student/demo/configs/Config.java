package student.demo.configs;

import student.demo.beans.Student;
import student.demo.beans.Teacher;
import student.demo.Context;
import student.demo.utilsInter.*;

import java.util.HashMap;

public class Config {
    public static Student student;
    public static Teacher teacher;
    public static StudentsUtil studentsUtil = Context.getStudentsUtil();
    public static TeachersUtil teachersUtil = Context.getTeachersUtil();
    public static Util util = Context.getUtil();
    public static MenuUtil menuUtil=Context.getMenuUtil();
    public static LoginUtil loginUtil=Context.getLoginUtil();
//    public static Student[] students=new Student[1];
    public static HashMap<Integer,Student> studentsMap=new HashMap<>();
//    public static Teacher[] teachers;
    public static HashMap<Integer,Teacher> teachersMap=new HashMap<>();;
}
