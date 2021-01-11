package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name=name;
        age=2;
        weight=2;
        address=null;
        color= "red";
    }
    public void initialize(String name,int weight, int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
        color = "black";
        address=null;
    }
    public void initialize(String name, int age){
        this.name=name;
        this.age=age;
        weight=2;
        color="white";
        address=null;
    }
    public void initialize(int weight, String color){
        this.weight=weight;
        this.color=color;
        age=3;
        name=null;
        address=null;
    }
    public void initialize(int weight,String color, String address){
        this.weight=weight;
        this.color=color;
        this.address=address;
        age=3;
        name=null;
    }

    //напишите тут ваш код
}
