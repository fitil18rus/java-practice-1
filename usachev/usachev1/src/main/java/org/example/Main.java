package org.example;

import java.util.Scanner;
//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main {
    public static void main(String[] args) {

        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        age = in.nextInt();

        int year = 2026;

        int your_age = year - age;


        if (your_age < 18) {
            System.out.println("Ты несовершеннолетний");
        } else if (your_age <= 65) {
            System.out.println("Ты взрослый");
        } else if (your_age > 65) {
            System.out.println("Вы пенсионер");
        }

        System.out.println(your_age);

    }
}

