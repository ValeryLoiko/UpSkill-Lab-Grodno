package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        for (int i = 0; i < a; i++){
            list.add(reader.readLine());
        }

        for (int i = 0; i < b; i++){
            list.add(list.get(0));
            list.remove(0);
        }

        for (String asd : list)
            System.out.println(asd);


        //напишите тут ваш код
    }
}
