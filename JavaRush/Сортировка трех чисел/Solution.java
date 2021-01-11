package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max, min, d, e;
        if (a>=b) d =a;
        else d=b;
         if (d>=c) max = d;
         else max = c;

         if(a<=b) e=a;
         else e=b;
         if (e<=c) min=e;
         else min = c;
         int mid = a+b+c - (max +min);
        System.out.println(max + " " + mid + " " + min);


        //напишите тут ваш код

    }
}
