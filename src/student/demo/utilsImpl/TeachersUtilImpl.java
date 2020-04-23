package student.demo.utilsImpl;

import student.demo.Context;
import student.demo.beans.Student;
import student.demo.configs.Config;
import student.demo.utilsInter.TeachersUtil;
import student.demo.utilsInter.Util;

public class TeachersUtilImpl implements TeachersUtil {

    @Override
    public Student registerStudent() {
        Util util = Config.util;
        int mapSize = Config.studentsMap.size() + 1;
        Student student = Context.getStudent();
        System.out.println("New id is " + mapSize);
        student.setId(mapSize);
        student.setName(util.inputText("Adı"));
        student.setSurname(util.inputText("Soyadı"));
        student.setAge(util.inputNumber("Yaşı"));
        Config.studentsMap.put(mapSize, student);
        return student;
    }

    @Override
    public void getAllStudents() {
        Config.studentsMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }

    @Override
    public void findStudent() {
        int typedNumber = Config.util.inputNumber("Type students id: ");
        Student s = Config.studentsMap.get(typedNumber);
        System.out.println(s);
    }


    @Override
    public String getMenuText() {
        return "\n 2.Register students" +
                "\n 3.Show students" +
                "\n 4. Find student" +
                "\n 5. Update student";
    }

    @Override
    public boolean updateStudent() {
        int typedNumber = Config.util.inputNumber("Type students id: ");
        Student s = Config.studentsMap.get(typedNumber);
        if (s == null) {
            return false;
        }
        Student updatedStudent = updateStudentFill(s);
        Config.studentsMap.put(typedNumber, updatedStudent);
        return true;
    }

    @Override
    public Student updateStudentFill(Student s) {
        String name = Config.util.inputText("Enter students name: ");
        String surname = Config.util.inputText("Enter students surname: ");
        int age = Config.util.inputNumber("Type students age: ");
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        return s;
    }

    @Override
    public void showInfo() {
        Config.teachersMap.get(1);
    }
}
