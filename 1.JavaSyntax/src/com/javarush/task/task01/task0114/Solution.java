package com.javarush.task.task01.task0114;

/* 
JavaRush. Learn once - use anywhere
*/

public class Solution {
    private static String TEXT ="JavaRush. Learn once - use anywhere";
    
    public static void main(String[] args) {
        //напишите тут ваш код
        printmore(TEXT,10);
    }
        
        public static void printmore(String s, int count){
            for (int i = 0; i < count; i++){
                System.out.println(s);
            }
    }
}
