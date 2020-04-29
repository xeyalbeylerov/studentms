package student.demo.utilsInter;

import student.demo.beans.Student;

import java.util.List;

public interface TeachersUtil extends PersonUtil{
    Student registerStudent();
    List getAllTeachersPassword();
    List getAllTeachersUsername();
    void printStudents();
    void findStudent();
    String getMenuText();
    boolean updateStudent();
//    Student updateStudentFill(Student s);
    boolean deleteStudent();
}
