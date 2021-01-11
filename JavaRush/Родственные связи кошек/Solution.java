package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,  null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother,null);

        String bratherName = reader.readLine();
        Cat catBrather = new Cat(bratherName, catMother, catFather );

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catBrather);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat grandParent;

        Cat(String name) {
            this.name = name;
        }

//        Cat(String name, Cat parent) {
//            this.name = name;
//            this.parent = parent;
//        }

        Cat(String name, Cat parent, Cat grandParent){
            this.name = name;
            this.parent = parent;
            this.grandParent = grandParent;
        }

        @Override
        public String toString() {
            if (parent == null && grandParent == null)
                return "The cat's name is " + name + ", no mother" + ", no father";
             if (parent == null && grandParent != null)
                return "The cat's name is " + name + ", no mother" + ", father is " + grandParent.name;
          else if (parent != null && grandParent == null)
              return ("The cat's name is ") + name + ", mother is " + parent.name + ", no father";
           else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + grandParent.name;



        }
    }

}
