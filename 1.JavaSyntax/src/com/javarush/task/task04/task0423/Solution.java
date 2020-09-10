package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year_str = reader.readLine();

        int year = Integer.parseInt(year_str);

        if (year>20) System.out.println("И 18-ти достаточно");
    }
}
