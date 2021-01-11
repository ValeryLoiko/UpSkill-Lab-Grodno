package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      double a = Double.parseDouble(reader.readLine());
        if (a % 5.0>=0.0  && a%5.0 < 3.0)   System.out.println("зелёный");
        else if (a%5.0 >= 3.0 && a%5.0 < 4.0) System.out.println("жёлтый");
        else if (a%5.0 >= 4.0 && a%5.0 < 5.0 )System.out.println("красный");

        //напишите тут ваш код

    }
}