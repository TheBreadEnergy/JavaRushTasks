package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman woman = new Woman();
        Cat vasiy = new Cat();
        vasiy.owner=woman;
        Dog Jack = new Dog();
        Jack.owner=woman;
        Fish qwerty = new Fish();
        qwerty.owner=woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
