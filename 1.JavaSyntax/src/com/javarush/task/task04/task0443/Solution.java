package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String str = reader.readLine();
        Integer y = Integer.parseInt(str);
        str = reader.readLine();
        Integer m = Integer.parseInt(str);
        str = reader.readLine();
        Integer d = Integer.parseInt(str);

        System.out.println("Меня зовут " + name + ".\n" + "Я родился "+d+"."+m+"."+y);

    }
}
