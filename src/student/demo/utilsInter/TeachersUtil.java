package student.demo.utilsInter;

import student.demo.beans.Student;

public interface TeachersUtil extends PersonUtil{
    Student registerStudent();
    void getAllStudents();
    void findStudent();
    String getMenuText();
    boolean updateStudent();
    Student updateStudentFill(Student s);
}
