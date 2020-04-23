package student.demo.utilsImpl;

import student.demo.beans.Student;
import student.demo.configs.Config;
import student.demo.Context;
import student.demo.utilsInter.TeachersUtil;
import student.demo.utilsInter.Util;

public class TeachersUtilImpl implements TeachersUtil {

    @Override
    public Student registerStudent() {
        Util util= Config.util;
        int mapSize=Config.studentsMap.size()+1;
        Student student=Context.getStudent();
        System.out.println("New id is "+mapSize);
        student.setName(util.inputText("Adı"));
        student.setSurname(util.inputText("Soyadı"));
        student.setAge(util.inputNumber("Yaşı"));
        Config.studentsMap.put(mapSize,student);
        return student;
    }

    @Override
    public String getMenuText() {
        return "\n 2.Register students" +
                "\n 3.Show students" +
                "\n 4. Find student" +
                "\n 5. Update student";
    }
}
