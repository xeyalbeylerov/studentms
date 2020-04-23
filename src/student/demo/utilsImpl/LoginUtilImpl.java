package student.demo.utilsImpl;

import student.demo.Context;
import student.demo.configs.Config;
import student.demo.utilsInter.LoginUtil;

public class LoginUtilImpl implements LoginUtil {

    @Override
    public boolean LoginLogic(String username, String password) {
        if (Config.username.equalsIgnoreCase(username) && Config.password.equals(password)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean login() {
        String username = Context.util.inputText("Type login: ");
        String password = Context.util.inputText("Type password: ");
        if (LoginLogic(username, password)) {
//            Config.teacher=new Teacher(1,"Sarkhan","Rasullu",27);
            System.out.println("login+");
            return true;
        } else {
//            throw new AccessDeniedException("Login or Password is incorrect");
            System.out.println("Login or Password is incorrect");
            return false;
        }
    }
}
