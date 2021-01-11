package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        BufferedReader readerFile = new BufferedReader(new InputStreamReader(input));

        ArrayList<Integer> list = new ArrayList<>();
        while (readerFile.ready()){
            int a = Integer.parseInt(readerFile.readLine());
            if (a %2 == 0){
                list.add(a);
            }
        }
        reader.close();
        readerFile.close();

        Collections.sort(list);
        for (int asd : list)
            System.out.println(asd);

    }
}
