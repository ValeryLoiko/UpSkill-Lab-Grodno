package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
          Set <Integer> list = new HashSet<>();
        for (int i = 0 ; i < 20; i++){
            list.add(i);
        }
        return list;
        // напишите тут ваш код

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
     //   Set<Integer> list2 = new HashSet<>();
        Iterator<Integer> enter = set.iterator();
        while (enter.hasNext()) {
            Integer a = enter.next();
            if (a > 10) {
                enter.remove();
            }
        }
        return set;

        // напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
