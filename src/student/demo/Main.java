package student.demo;


import student.demo.beans.Student;
import student.demo.configs.Config;
import student.demo.file.FileObj;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        if(FileObj.ReadObjectFromFile()!=null){
            HashMap config=(HashMap) FileObj.ReadObjectFromFile();
            Config.studentsMap=config;
        }

        Config.teachersMap.put(1,Config.teacher);

        Context.util.Cycle();
    }
}
