package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
Cat cat1 = new Cat();
Cat cat2 = new Cat();
Cat cat3 = new Cat();
Cat cat4 = new Cat();
result.add(cat1);
result.add(cat2);
result.add(cat3);
result.add(cat4);

        return result;
    }

    public static Set<Dog> createDogs() {
       Set<Dog> dogs = new HashSet<Dog>();
       Dog dog1 = new Dog();
       Dog dog2 = new Dog();
       Dog dog3 = new Dog();
       dogs.add(dog1);
       dogs.add(dog2);
       dogs.add(dog3);

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
       Set<Object> pats = new HashSet<Object>();
       pats.addAll(cats);
       pats.addAll(dogs);

        return pats;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
//       Set<Object> pats = new HashSet<Object>();
//       for (Object a : pats){
//           if (a.equals(cats))
//               pats.remove(a);
//       }
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets) {
       for (Object a : pets)
           System.out.println(a);

    }

    public static class Cat{

    }
    public static class Dog{

    }

}
