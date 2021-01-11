package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5];
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;

        Arrays.sort(arr);



        for (int f : arr)
            System.out.println(f);


        //напишите тут ваш код
    }
}
