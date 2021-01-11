package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Valera", true, 28);
        Human child2 = new Human("Sergej", true, 28);
        Human child3 = new Human("Sasha", true, 31);

        Human father = new Human("Roman", true, 60, child1, child2, child3);
        Human mother = new Human("Lena", false, 52, child1, child2, child3);

        Human babushka1 = new Human("Al'bina", false, 68, father);
        Human babushka2 = new Human("Valia", false, 65, mother);

       Human dad1 = new Human("Fedia", true, 65, father);
       Human dad2 = new Human("Semion", true, 70, mother);
        System.out.println(dad1);
        System.out.println(dad2);
        System.out.println(babushka1);
        System.out.println(babushka2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human  {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, Human ... children){
            this.name = name;
            this.sex = sex;
            this.age = age;
           Collections.addAll(this.children,children);

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
