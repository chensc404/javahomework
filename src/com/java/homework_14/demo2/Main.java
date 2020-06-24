package com.java.homework_14.demo2;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        File f1 = new File("data.txt");
        File f2 = new File("data1.txt");
        System.out.println(fileCmp(f1,f2));
    }
    public static boolean fileCmp(File f1, File f2) {
        InputStream inputStreamf1 = null;
        InputStream inputStreamf2 = null;
        try {
            inputStreamf1 = new FileInputStream(f1);
            inputStreamf2 = new FileInputStream(f2);
            byte[] flush1 = new byte[inputStreamf1.available()];
            byte[] flush2 = new byte[inputStreamf2.available()];
            if (inputStreamf1.available() != inputStreamf2.available()) {
                return false;
            }
            inputStreamf1.read(flush1);
            inputStreamf2.read(flush2);
            int len = inputStreamf1.available();
            for (int i = 0; i < len; i++) {
                if (flush1[i] != flush2[i])
                    return false;
            }

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        return true;
    }
}
