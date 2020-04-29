package student.demo.utilsImpl;

import student.demo.Context;
import student.demo.beans.Student;
import student.demo.beans.Teacher;
import student.demo.configs.Config;
import student.demo.utilsInter.TeachersUtil;
import student.demo.utilsInter.Util;

public class TeachersUtilImpl implements TeachersUtil {

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
    public void getAllStudents() {
        Config.studentsMap.forEach((k, v) -> {

            System.out.println(k + " " + v);
        });
    }

    @Override
    public void findStudent() {
        int typedNumber = Context.util.inputNumber("Type students id: ");
        Student s = Config.studentsMap.get(typedNumber);
        System.out.println(s);
    }


    @Override
    public String getMenuText() {
        return "\n      2.Register students" +
                "\n      3.Show students" +
                "\n      4. Find student for id" +
                "\n      5. Update student" +
                "\n      6. Delete student";
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

    @Override
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
    public void showInfo() {
        Teacher t = Config.teachersMap.get(1);
        System.out.println(t);
    }
}
