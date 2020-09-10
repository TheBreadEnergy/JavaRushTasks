package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        Double a = Double.parseDouble(str1);

        if (a % 5 < 3) {
            System.out.println("зелёный");
        } else if (a % 5 < 4) {
            System.out.println("жёлтый");
        } else  {
            System.out.println("красный");
        }
    }
}