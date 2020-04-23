package student.demo.utilsImpl;

import student.demo.beans.Teacher;
import student.demo.configs.Config;
import student.demo.utilsInter.Util;

import java.util.Scanner;

public class UtilImpl implements Util {

    @Override
    public String welcomeText(String name) {
        return "Welcome " + name;
    }

    @Override
    public String inputText(String entryName) {
        Scanner scan = new Scanner(System.in);
        System.out.print(entryName);
        return scan.nextLine();
    }

    @Override
    public Integer inputNumber(String entryName) {
//        Config.loginUtil.login();
        Scanner scan = new Scanner(System.in);
        System.out.print(entryName);
        return scan.nextInt();
    }

    @Override
    public void Cycle() {

        while (true) {
            if (!Config.loginUtil.login()) {
                continue;
            }
            while (true) {
                Teacher t = Config.teacher;
                System.out.println(welcomeText(t.getName()));
                Config.menuUtil.menu(t.getId() == 1);
            }
        }
    }

}
