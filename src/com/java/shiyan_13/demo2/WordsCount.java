package com.java.shiyan_13.demo2;

import java.io.*;
import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Which word do you need to count:");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        String targetWord = in.nextLine();
        try{
            BufferedReader bfReader = new BufferedReader(new FileReader(new File("e:/originData.txt")));
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(new File("e:/countOut.txt")));
            String Line = null;
            while((Line = bfReader.readLine()) != null){
                String[] words = Line.split("[., ]");
                for (int i = 0; i < words.length; i++) {
                    if(targetWord.equals(words[i])){
                        sum++;
                    }
                }
            }
            bfWriter.write(targetWord + ":" + sum);
            bfReader.close();
            bfWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
