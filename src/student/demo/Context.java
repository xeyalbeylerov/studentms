package student.demo;

import student.demo.beans.Student;
import student.demo.beans.Teacher;
import student.demo.utilsImpl.TeachersUtilImpl;
import student.demo.utilsImpl.UtilImpl;
import student.demo.utilsInter.StudentsUtil;
import student.demo.utilsInter.TeachersUtil;
import student.demo.utilsImpl.StudentsUtilImpl;
import student.demo.utilsInter.Util;

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

    public static Student getStudent() {
        return new Student();
    }

    public static Teacher getTeacher() {
        return new Teacher();
    }
}
