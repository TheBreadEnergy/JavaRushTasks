package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();

        int a = Integer.parseInt(str1);
        int c = Integer.parseInt(str2);
        int b = Integer.parseInt(str3);

        if(((a+b)>c)&&((b+c)>a)&&((a+c)>b)){
            System.out.println("Треугольник существует.");
        }
        else System.out.println("Треугольник не существует.");
    }
}