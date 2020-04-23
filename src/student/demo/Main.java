package student.demo;


import student.demo.configs.Config;

public class Main {
    public static void main(String[] args) {
        Config.teachersMap.put(1,Config.teacher);
        Context.util.Cycle();
    }
}
