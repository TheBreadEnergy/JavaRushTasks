package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 1;
        int b = 1;
        while (a <= 10) {
            while (b <= 10) {
                System.out.print(a * b + " ");
                b++;
            }
            System.out.println();
            b = 1;
            a++;
        }
    }
}
