package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        readFile();
    }

    public static void readFile() throws Exception {

           FileReader fr = new FileReader("numbers.txt");
           Scanner sc = new Scanner(fr);

           int i = 0;
           String [] numbers = new String[3];
           while (sc.hasNextLine()){
               numbers[i]=sc.nextLine();
               i++;
           }

           for (int j=0;j<numbers.length; j++){
               char [] tempChar = numbers[j].toCharArray();
               if((tempChar[3]=='-'&& tempChar[7]=='-')||(tempChar[0] == '('&&tempChar[4] == ')'&&tempChar[9]=='-')){
                   System.out.println(numbers[j]);
               }
           }

    }
}