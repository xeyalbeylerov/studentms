package student.demo.utilsImpl;

import student.demo.configs.Config;
import student.demo.utilsInter.MenuUtil;

public class MenuUtilImpl implements MenuUtil {
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
            selectedMenu = Config.util.inputNumber("Admin \n please select menu:");
        } else {
            selectedMenu = Config.util.inputNumber("Student \n please select menu:");
        }
        return selectedMenu;
    }

    @Override
    public boolean menuLogic(int selectedMenu) {
        if (selectedMenu == 1) {
        } else if (selectedMenu == 2) {
            Config.teachersUtil.registerStudent();
        } else if (selectedMenu == 3) {
            Config.teachersUtil.getAllStudents();
        } else if (selectedMenu == 4) {
            Config.teachersUtil.findStudent();
        } else if (selectedMenu == 5) {
            Config.teachersUtil.updateStudent();
        } else if (selectedMenu == 6) {
            System.exit(0);
        } else {
            return false;
        }
        return true;
    }
}
