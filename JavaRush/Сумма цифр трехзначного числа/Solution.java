package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number / 100;
        int b = ((number -(a*100)) /10);
        int d = number - (a*100+b*10);
        int c = a + b + d;
        return c;
        //напишите тут ваш код
    }
}