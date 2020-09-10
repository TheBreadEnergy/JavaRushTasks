package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer result = 0;
        while (true) {
            String str = reader.readLine();
            int number = Integer.parseInt(str);
            result+=number;
            if (number == -1)
            break;
        }
        System.out.println(result);
    }
}
