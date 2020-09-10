package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;

        for (int i = 0; i < 3; i++) {
            String str = reader.readLine();
            int num = Integer.parseInt(str);
            if (num < 0) a++;
            if (num > 0) b++;
        }
        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);

    }
}
