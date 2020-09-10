package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String a = reader.readLine();
        int n1 = Integer.parseInt(a);
        String b = reader.readLine();
        int n2 = Integer.parseInt(b);
        
        if(n1<n2)
        System.out.println(n1);
        if(n2<n1)
        System.out.println(n2);
        if(n1==n2)
        System.out.println(n1);
    }
}