package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        String min = list.get(0);
        String max = list.get(0);
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() < min.length()){
                min = list.get(i);
                indexMin = i;
            }
            if (list.get(i).length() > max.length()) {
                max = list.get(i);
                indexMax = i;
            }
        }
        if (indexMin < indexMax)
            System.out.println(list.get(indexMin));
        else System.out.println(list.get(indexMax));

    }
}
