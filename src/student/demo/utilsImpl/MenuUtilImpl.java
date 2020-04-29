package student.demo.utilsImpl;

import student.demo.Context;
import student.demo.configs.Config;
import student.demo.file.FileObj;
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
        String text = Context.studentsUtil.getMenuText();
        if (isAdmin) {
            text += Context.teachersUtil.getMenuText();
        }
        text += "\n      7. Exit";
        return text;
    }

    @Override
    public int menuInput(boolean isAdmin) {
        int selectedMenu = -1;
        if (isAdmin) {
            selectedMenu = Context.util.inputNumber("Admin please select menu:");
        } else {
            selectedMenu = Context.util.inputNumber("Student please select menu:");
        }
        return selectedMenu;
    }

    @Override
    public boolean menuLogic(int selectedMenu) {
        if (selectedMenu == 1) {
            Context.teachersUtil.showInfo();
        } else if (selectedMenu == 2) {
            Context.teachersUtil.registerStudent();
        } else if (selectedMenu == 3) {
            Context.teachersUtil.getAllStudents();
        } else if (selectedMenu == 4) {
            Context.teachersUtil.findStudent();
        } else if (selectedMenu == 5) {
            Context.teachersUtil.updateStudent();
        } else if (selectedMenu == 6) {
            Context.teachersUtil.deleteStudent();
        }else if (selectedMenu == 7) {

            FileObj.WriteObjectToFile(Config.studentsMap);
            System.exit(0);
        } else {
            return false;
        }
        return true;
    }
}
