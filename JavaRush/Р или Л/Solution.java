package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int [] numbers = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int even = 0, odd = 0;
        for (int i = 0; i< numbers.length; i+=2){
            even += numbers[i];
        }
        for (int i = 1; i < numbers.length; i+=2){
            odd += numbers[i];
        }
        if (odd>even) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");


        //напишите тут ваш код
    }
}
