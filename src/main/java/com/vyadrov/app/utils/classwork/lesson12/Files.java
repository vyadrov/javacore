package com.vyadrov.app.utils.classwork.lesson12;

import com.vyadrov.app.utils.homework.lesson10.Palindroms;

import java.io.*;

public class Files {
    public static void files() throws IOException {
        /*String firstline = "The first line";
        String secondline = "The second line";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\output.txt")));
        writer.append(firstline);
        writer.newLine();
        writer.append(secondline);
        writer.close();*/


        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Text.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                Palindroms.palindromeByReverse(line);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\output.txt")));
                writer.append(line);
                writer.close();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Bye!");
        }
    }
}
