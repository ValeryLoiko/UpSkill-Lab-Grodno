package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a = reader.readLine();
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(a))){
                while (true) {
                    String word = reader.readLine();
                    if (!word.equals("exit")){
                        writer.write(word);
                        writer.newLine();
                    }else {
                        writer.write(word);
                        break;
                    }
                }





        }
catch (IOException e){
            e.printStackTrace();
}

        // напишите тут ваш код
        // /Users/diana/Desktop/obu4enie/src/diana
    }
}
