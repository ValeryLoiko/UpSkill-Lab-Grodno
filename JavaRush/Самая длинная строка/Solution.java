package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        int max = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() > max)
                max = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++){
            if (max == strings.get(i). length())
                System.out.println(strings.get(i));
        }
    }
}
