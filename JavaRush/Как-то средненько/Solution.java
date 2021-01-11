package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(reader.readLine());
       int b = Integer.parseInt(reader.readLine());
       int c = Integer.parseInt(reader.readLine());

       int max, min, mid, d,e, f,r;

       if (a>=b) d=a;
       else d=b;
       if (a>=c) e=a;
       else e=c;
       if (d>=e) max=d;
       else max = e;

       if (a<=b) f=a;
       else f=b;
       if (a<=c) r=a;
       else r=c;
       if (f<=r) min = f;
       else min = r;
       mid = a+b+c - (max+min);
        System.out.println(mid);

        //напишите тут ваш код

    }
}
