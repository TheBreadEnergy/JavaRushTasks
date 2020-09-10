package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();

        int num = Integer.parseInt(str2);

        int i = 0;
        while (i < num){
            System.out.println(str1);
            i++;
        }
    }
}
