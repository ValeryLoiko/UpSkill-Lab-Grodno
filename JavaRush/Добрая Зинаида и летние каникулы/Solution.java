package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("D", dateFormat.parse("MAY 1 2012"));
        map.put("S", dateFormat.parse("SEP 1 2012"));
        map.put("SAS", dateFormat.parse("JUNE 1 2012"));
        map.put("SA", dateFormat.parse("JULY 1 2012"));
        map.put("SS", dateFormat.parse("AUGUST 1 2012"));
        map.put("A", dateFormat.parse("FEB 1 2012"));
        map.put("X", dateFormat.parse("NOV 1 2012"));
        map.put("Z", dateFormat.parse("JULY 1 2012"));
        map.put("C", dateFormat.parse("JUNE 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
    //        String b = pair.getKey();
            Date a = pair.getValue();
            int monyh = a.getMonth();
            if (monyh > 4 && monyh < 8)
                iterator.remove();



        }
    }

    public static void main(String[] args) {

    }
}
