package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
for (Cat a : cats){
    cats.remove(a);
    break;

}
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
       Set<Cat> miau = new HashSet<Cat>();
       Cat cat1 = new Cat();
       Cat cat2 = new Cat();
       Cat cat3 = new Cat();
       miau.add(cat1);
       miau.add(cat2);
       miau.add(cat3);
        //напишите тут ваш код. step 2 - пункт 2
        return miau;
    }

    public static void printCats(Set<Cat> cats) {
       Iterator<Cat> iterator = cats.iterator();
       while (iterator.hasNext()) {

           System.out.println(iterator.next());
       }
        // step 4 - пункт 4
    }

   public static class Cat{

   } // step 1 - пункт 1
}
