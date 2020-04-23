package student.demo.utilsInter;

public interface Util {
    String welcomeText(String name);
    String inputText(String entryName);
    Integer inputNumber(String entryName);
    int menu(boolean isAdmin);
    String menuTexts(boolean isAdmin);
    int menuInput(boolean isAdmin);
    boolean menuLogic(int selectedMenu);
    void Cycle();
}
