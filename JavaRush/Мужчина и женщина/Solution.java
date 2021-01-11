package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
       Man man1 = new Man("Sergej", 28, "gorod Brest");
       Man mam2 = new Man("Valera", 28, "gorod Grodno");

       Woman woman1 = new Woman("Kira", 28, "gorod Brest");
       Woman woman2 = new Woman("Diana", 24, "gorod Grodno");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(mam2.name + " " + mam2.age + " " + mam2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
       //напишите тут ваш код
    }

   public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
   }

   public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
   }
    //напишите тут ваш код
}
