package student.demo.utilsImpl;

import student.demo.Context;
import student.demo.beans.Student;
import student.demo.beans.Teacher;
import student.demo.configs.Config;
import student.demo.utilsInter.LoginUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginUtilImpl implements LoginUtil {

//    public Student loginLogicStudent(String username, String password) {
//        for (Map.Entry<Integer, Student> entry : Config.studentsMap.entrySet()) {
////            Integer key = entry.getKey();
//            Student student = entry.getValue();
//            if (student.getUsername().equalsIgnoreCase(username) && student.getPassword().equals(password)) {
//                return student;
//            }
//        }
//        return null;
//    }
//    public Teacher loginLogicTeacher(String username, String password) {
//        for (Map.Entry<Integer, Teacher> entry : Config.teachersMap.entrySet()) {
////            Integer key = entry.getKey();
//            Teacher teacher = entry.getValue();
//            if (teacher.getUsername().equalsIgnoreCase(username) && teacher.getPassword().equals(password)) {
//                return teacher;
//            }
//        }
//        return null;
//    }

    public boolean LoginLogic(String username, String password) {
        boolean checkUsername = false;
        boolean checkPassword = false;

        Object o;
        List<String> listUsername = getAllStudentsAndTeachersUsename();
        List<String> listPassword = getAllStudentsAndTeachersPassword();
        for (String s : listUsername) {
            if (s.equalsIgnoreCase(username)) {
                checkUsername = true;
            }
        }
        for (String s : listPassword) {
            if (s.equalsIgnoreCase(password)) {
                checkPassword = true;
            }
        }

        if (checkUsername && checkPassword) {
            return true;
        }
        return false;
    }

    @Override
    public Object login() {
        String username = Context.util.inputText("Type login: ");
        String password = Context.util.inputText("Type password: ");
//        System.out.println("-"+username+"-"+password+"-");
        if (LoginLogic(username, password)) {
//            Config.teacher=new Teacher(1,"Sarkhan","Rasullu",27);
            return true;
        } else {
//            throw new AccessDeniedException("Login or Password is incorrect");
            System.out.println("Login or Password is incorrect");
            return false;
        }
    }

    @Override
    public boolean logout() {
        System.err.println("Logout");
        login();
        return true;
    }

    public List getAllStudentsAndTeachersUsename() {
        List<String> list = new ArrayList<>();
        list.addAll(Context.studentsUtil.getAllStudentsUsername());
        list.addAll(Context.teachersUtil.getAllTeachersUsername());
        return list;
    }

    public List getAllStudentsAndTeachersPassword() {
        List<String> list = new ArrayList<>();
        list.addAll(Context.studentsUtil.getAllStudentsPassword());
        list.addAll(Context.teachersUtil.getAllTeachersPassword());
        return list;
    }

}
