package student.demo.utilsImpl;

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
        System.out.print(entryName + " select menu: ");
        return scan.nextLine();
    }

    @Override
    public Integer inputNumber(String entryName) {
        Scanner scan = new Scanner(System.in);
        System.out.print(entryName + " daxil edin: ");
        return scan.nextInt();
    }


    @Override
    public void Cycle() {
        System.out.println(welcomeText("Sarkhan"));
        while (true) {
            menu(false);
        }
    }

    @Override
    public int menu(boolean isAdmin) {
        System.out.println(menuTexts(isAdmin));
        menuLogic(menuInput(isAdmin));


        return -1;
    }

    @Override
    public String menuTexts(boolean isAdmin) {
        String text = Config.studentsUtil.getMenuText();
        if (isAdmin) {
            text += Config.teachersUtil.getMenuText();
        }
        text += "\n 6. Exit";
        return text;
    }

    @Override
    public int menuInput(boolean isAdmin) {
        int selectedMenu = -1;
        if (isAdmin) {
            selectedMenu = Config.util.inputNumber("Admin \n");
        } else {
            selectedMenu = Config.util.inputNumber("Student \n");
        }
        return selectedMenu;
    }

    @Override
    public boolean menuLogic(int selectedMenu) {
        if (selectedMenu == 1) {

        } else if (selectedMenu == 2) {
            Config.teachersUtil.registerStudent();
        } else if (selectedMenu == 3) {

        } else if (selectedMenu == 4) {

        } else if (selectedMenu == 5) {

        } else if (selectedMenu == 6) {
            System.exit(0);
        } else {
            return false;
        }
        return true;
    }
}
