package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
В этой задаче тебе нужно:
Считать с консоли имя файла.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String a = reader.readLine();

        InputStream inputStream = new FileInputStream(a);
        while (inputStream.available() > 0) {
            System.out.print((char) inputStream.read());
        }
        inputStream.close();
   //     reader.close();

    }
}
