package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();

        Date d = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(a);

        SimpleDateFormat dataJava = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(dataJava.format(d).toUpperCase());

        //напишите тут ваш код
    }
}
