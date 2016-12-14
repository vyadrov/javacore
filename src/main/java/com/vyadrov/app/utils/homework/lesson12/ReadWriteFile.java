package com.vyadrov.app.utils.homework.lesson12;

import com.vyadrov.app.utils.homework.lesson10.Palindroms;
import com.vyadrov.app.utils.homework.lesson9.ArrayPrint;
import com.vyadrov.app.utils.homework.lesson9.Sorting;

import java.io.*;

public class ReadWriteFile {
    public static void readWrite() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/vyadrov/Lesson12.txt"));
            String line;
            StringBuilder str1 = new StringBuilder();
            String s1 = reader.readLine();
            String s2 = reader.readLine();
            System.out.println("s1=" + s1);
            System.out.println("s2=" + s2);

            String[] arrayStr1 = s1.split(",");
            String[] arrayStr2 = s2.split(",");
            int[] array1 = new int[arrayStr1.length];
            for (int i = 0; i < arrayStr1.length; i++) {
                array1[i] = Integer.parseInt(arrayStr1[i]);
            }
            int[] sortedMes1 = Sorting.selectionSortMinToMax(array1);

            int[] array2 = new int[arrayStr2.length];
            for (int i = 0; i < arrayStr2.length; i++) {
                array2[i] = Integer.parseInt(arrayStr2[i]);
            }

            int[] sortedMes2 = Sorting.selectionSortMinToMax(array2);

            String result1 = "";
            for (int i = 0; i < sortedMes1.length; i++) {
                result1 = result1 + sortedMes1[i];
                if (i != sortedMes1.length - 1) {
                    result1 = result1 + ",";
                }
            }

            String result2 = "";
            for (int i = 0; i < sortedMes2.length; i++) {
                result2 = result2 + sortedMes2[i];
                if (i != sortedMes2.length - 1) {
                    result2 = result2 + ",";
                }
            }

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/vyadrov/output.txt")));

            writer.append(result1);
            writer.newLine();
            writer.append(result2);
            writer.close();
            //ArrayPrint.selectionOutMaxToMin(array);

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Bye");
        }
    }
}
