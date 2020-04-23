package student.demo.utilsInter;

public interface MenuUtil{
    int menu(boolean isAdmin);
    String menuTexts(boolean isAdmin);
    int menuInput(boolean isAdmin);
    boolean menuLogic(int selectedMenu);
}
