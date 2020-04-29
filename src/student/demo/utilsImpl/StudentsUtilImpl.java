package student.demo.utilsImpl;

import student.demo.Context;
import student.demo.beans.Student;
import student.demo.configs.Config;
import student.demo.utilsInter.StudentsUtil;
import student.demo.utilsInter.Util;

import java.util.ArrayList;
import java.util.List;

public class StudentsUtilImpl implements StudentsUtil {
    @Override
    public Student registerStudent() {
        Util util = Context.util;
        int mapSize = Config.studentsMap.size() + 1;
        Student student = Context.getStudent();
        System.out.println("New id is " + mapSize);
        student.setId(mapSize);
        student.setName(util.inputText("Name: "));
        student.setSurname(util.inputText("Surname: "));
        student.setAge(util.inputNumber("Age: "));
        Config.studentsMap.put(mapSize, student);
        System.out.println("Student is recorded");
        return student;
    }

    @Override
    public List getAllStudentsPassword() {
        List<String> list = new ArrayList<>();
        Config.studentsMap.forEach((k, v) -> {
            list.add(v.getPassword());
        });
        return list;
    }

    @Override
    public List getAllStudentsUsername() {
        List<String> list = new ArrayList<>();
        Config.teachersMap.forEach((k, v) -> {
            list.add(v.getUsername());
        });
        return list;
    }


    @Override
    public void findStudent() {
        int typedNumber = Context.util.inputNumber("Type students id: ");
        Student s = Config.studentsMap.get(typedNumber);
        System.out.println(s);
    }

    @Override
    public void fillStudents() {

    }

    @Override
    public boolean updateStudent() {
        int id = Context.util.inputNumber("Type students id: ");
        if (Context.studentsUtil.mapIsNull(id) == true) {
            System.err.println("Student " + id + " is not exist");
            return false;
        }
        Student s = Config.studentsMap.get(id);
        Student updatedStudent = updateStudentFill(s);
        Config.studentsMap.put(id, updatedStudent);
        System.out.println("Student " + id + " is updated");
        return true;
    }
    public Student updateStudentFill(Student s) {
        String name = Context.util.inputText("Enter students name: ");
        String surname = Context.util.inputText("Enter students surname: ");
        int age = Context.util.inputNumber("Type students age: ");
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        return s;
    }
    @Override
    public boolean deleteStudent() {
        int id = Context.util.inputNumber("Type students id which you will delete: ");
        if (Context.studentsUtil.mapIsNull(id) == true) {
            System.err.println("Student " + id + " is not exist");
            return false;
        }
        if (!Context.util.areYouSure("Are you sure for delete" + id + " student?")) {
            return false;
        }

        Config.studentsMap.remove(id);
        System.err.println("Student " + id + " is deleted");
        return true;
    }

    @Override
    public void printStudents() {
        Config.studentsMap.forEach((k, v) -> {

            System.out.println(k + " " + v);
        });
    }

    public boolean mapIsNull(int i) {

        if (null == Config.studentsMap.get(i)) {
            return true;
        }
        return false;
    }

    @Override
    public String getMenuText() {
        return "      1.Show info";
    }

    @Override
    public void showInfo() {
        System.out.println(Config.studentsMap.get(1));
    }
}
