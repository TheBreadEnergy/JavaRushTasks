package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String n1 = reader.readLine();
        int g = Integer.parseInt(n1);
        if(g<0)
        System.out.println(g+1);
        if(g>0)
        System.out.println(g*2);
        if(g==0)
        System.out.println(0);
    }

}