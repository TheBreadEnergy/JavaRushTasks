package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int[3];
        for (int i = 0; i < 3; i++){
            num[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(num);
        System.out.println(num[1]);
    }
}
