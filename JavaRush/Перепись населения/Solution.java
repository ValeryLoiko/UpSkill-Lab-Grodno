package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> list = new HashMap<>();
        list.put("A","AA");
        list.put("B","BB");
        list.put("C","CC");
        list.put("D","DD");
        list.put("E","EE");
        list.put("GG","AA");
        list.put("CC","CC");
        list.put("AA","DD");
        list.put("W","WW");
        list.put("F","AA");
        return list;
        //напишите тут ваш код
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String a = pair.getValue();
            if (a.contains(name))
                i++;
        }
        return i;
        //напишите тут ваш код
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int j = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> parus = iterator.next();

            String b = parus.getKey();
            if (b.equals(lastName))
                j++;
        }
        return j;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
