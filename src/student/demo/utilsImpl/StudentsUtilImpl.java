package student.demo.utilsImpl;

import student.demo.configs.Config;
import student.demo.utilsInter.StudentsUtil;

public class StudentsUtilImpl implements StudentsUtil {
    @Override
    public void fillStudents() {

    }

    @Override
    public void printStudents() {

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
