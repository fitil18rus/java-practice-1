package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        lab1();
        lab2();
        lab3();

     }
     public static void lab1(){

         int age;
         Scanner in = new Scanner(System.in);
         System.out.print("Введите возраст: ");
         age = in.nextInt();

         int year = 2026;

         int your_age = year - age;


         if (age < 18) {
             System.out.println("Ты несовершеннолетний");
         } else if (age <= 65) {
             System.out.println("Ты взрослый");
         } else if (age > 65) {
             System.out.println("Вы пенсионер");
         }

         System.out.println(your_age);


     }

     public  static  void lab2(){

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }

        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Сумма четных элементов: " + sum);

     }

     public static void lab3(){

         for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= 5; j++) {
                 System.out.println(i + " * " + j + " = " + (i * j));
             }
             System.out.println();
         }

     }
}

