package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine());
        while (c!=0) {
            if ((c / 1000) % 2 == 0)
                even++;
            else odd++;

            if ((c / 100) % 2 == 0)
                even++;
            else odd++;

            if ((c / 10) % 2 == 0)
                even++;
            else odd++;

            if (c % 2 == 0)
                even++;
            else odd++;
        }
        System.out.println("Even: "+ even +" Odd: " + odd);
        //напишите тут ваш код
    }
}




//
//          while (a!=0){
//          if (a %2 == 0)
//          even++;
//          else
//          odd++;
//          a/=10;
//          }