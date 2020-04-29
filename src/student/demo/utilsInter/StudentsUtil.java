package student.demo.utilsInter;

import student.demo.beans.Student;

import java.util.List;

public interface StudentsUtil extends PersonUtil{
    Student registerStudent();
//    void getAllStudents();
    List getAllStudentsPassword();
    List getAllStudentsUsername();
    void findStudent();
    void fillStudents();
    boolean updateStudent();
    boolean deleteStudent();
    void printStudents();
    String getMenuText();
    public boolean mapIsNull(int i);
}
