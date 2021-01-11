package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

       int b = Collections.min(array);
        // Найти минимум тут
        return b;
    }

    public static List<Integer> getIntegerList() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(reader.readLine());

        List <Integer> spisok = new ArrayList<>();
        for (int i = 0; i < a; i++){
            int b = Integer.parseInt(reader.readLine());
            spisok.add(i,b);
        }

        // Создать и заполнить список тут
        return spisok;
    }
}
