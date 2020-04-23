package student.demo.utilsImpl;

import student.demo.beans.Teacher;
import student.demo.configs.Config;
import student.demo.utilsInter.LoginUtil;

public class LoginUtilImpl implements LoginUtil {

    @Override
    public boolean LoginLogic(String username, String password) {
        if ("admin".equalsIgnoreCase(username) && "admin".equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean login() {
        String username = Config.util.inputText("Type login: ");
        String password = Config.util.inputText("Type password: ");
        if (LoginLogic(username, password)) {
            Config.teacher=new Teacher(1,"Sarkhan","Rasullu",27);
            System.out.println("login+");
            return true;
        } else {
//            throw new AccessDeniedException("Login or Password is incorrect");
            System.out.println("Login or Password is incorrect");
            return false;
        }
    }
}
