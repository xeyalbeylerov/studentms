package student.demo.file;

import student.demo.configs.Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileObj {

    static String filePath = "C:\\Users\\xeyal\\Desktop\\obj.txt";
    public static void WriteObjectToFile(Object serObj) {

        try {

            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
//            System.out.println("The Object  was succesfully written to a pese.java.file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static Object ReadObjectFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

//            System.out.println("The Object has been read from the pese.java.file");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
//            ex.printStackTrace();
            return null;
        }
    }
}
