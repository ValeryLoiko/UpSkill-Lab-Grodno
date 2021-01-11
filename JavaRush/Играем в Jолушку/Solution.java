package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> del3 = new ArrayList<>();
        ArrayList<Integer> del2 = new ArrayList<>();
        ArrayList<Integer> allLast = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) %3 == 0)
                del3.add(list.get(i));

             if (list.get(i) %2 == 0)
                del2.add(list.get(i));

            else if (list.get(i) %3 != 0 && list.get(i) %2 != 0)
                allLast.add(list.get(i));

        }

        printList(del3);
        printList(del2);
        printList(allLast);

    }


    public static void printList(ArrayList<Integer> list) {
      for (Integer x : list)
          System.out.println(x);

    }
}
