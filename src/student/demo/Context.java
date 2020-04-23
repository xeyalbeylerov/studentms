package student.demo;

import student.demo.beans.Student;
import student.demo.beans.Teacher;
import student.demo.utilsImpl.*;
import student.demo.utilsInter.*;

public class Context {
    public static StudentsUtil getStudentsUtil() {
        return new StudentsUtilImpl();
    }

    public static TeachersUtil getTeachersUtil() {
        return new TeachersUtilImpl();
    }

    public static Util getUtil() {
        return new UtilImpl();
    }

    public static MenuUtil getMenuUtil() {
        return new MenuUtilImpl();
    }

    public static LoginUtil getLoginUtil() {
        return new LoginUtilImpl();
    }

    public static Student getStudent() {
        return new Student();
    }

    public static Teacher getTeacher() {
        return new Teacher();
    }

    public static StudentsUtil studentsUtil = Context.getStudentsUtil();
    public static TeachersUtil teachersUtil = Context.getTeachersUtil();
    public static Util util = Context.getUtil();
    public static MenuUtil menuUtil=Context.getMenuUtil();
    public static LoginUtil loginUtil=Context.getLoginUtil();
//    public static Student[] students=new Student[1];
}
