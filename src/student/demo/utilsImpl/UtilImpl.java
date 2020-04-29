package student.demo.utilsImpl;

import student.demo.Context;
import student.demo.beans.Teacher;
import student.demo.configs.Config;
import student.demo.utilsInter.Util;

import java.util.InputMismatchException;
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
        String str=scan.nextLine().trim();
        if(str.isEmpty()){
            System.out.println("");
            System.out.print("Required ");

            str=inputText(entryName);
        }
        return str;
    }

    @Override
    public Integer inputNumber(String entryName) {
//        Config.loginUtil.login();
        Scanner scan = new Scanner(System.in);
        System.out.print(entryName);
        int i=0;
        try {
            i = scan.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("");
            System.out.print("Required (only number) ");
            i=inputNumber(entryName);
        }
        return i;
    }

    @Override
    public boolean areYouSure(String text) {
        String typedtext=inputText("Type Y for yes or N for No");
        if("y".equalsIgnoreCase(typedtext)){
            return true;
        }
        return false;
    }

    @Override
    public void Cycle() {

        while (true) {
            if (!Context.loginUtil.login()) {
                continue;
            }
            int i=1;
            Teacher t = Config.teacher;
            while (true) {
                Context.menuUtil.menu(t.getId() == 1);

            }
        }
    }

}
