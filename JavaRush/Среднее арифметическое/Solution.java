package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
double resoult=0;
        for (; true;){
            int a = Integer.parseInt(reader.readLine());
            count++;
            resoult+=a;
            if (a==-1)
               break;

        }

        System.out.println((resoult+1)/(count-1) );


    //напишите тут ваш код
    }
}

