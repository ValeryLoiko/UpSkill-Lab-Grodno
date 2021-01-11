package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
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

        //напишите тут ваш код

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
        //напишите тут ваш код
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
       Set<Object> pats = new HashSet<Object>();
       pats.addAll(cats);
       pats.addAll(dogs);
        //напишите тут ваш код
        return pats;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
//       Set<Object> pats = new HashSet<Object>();
//       for (Object a : pats){
//           if (a.equals(cats))
//               pats.remove(a);
//       }
        pets.removeAll(cats);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
       for (Object a : pets)
           System.out.println(a);
        //напишите тут ваш код
    }

    public static class Cat{

    }
    public static class Dog{

    }
    //напишите тут ваш код
}
