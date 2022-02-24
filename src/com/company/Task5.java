package com.company;

import java.util.Scanner;

/*
Task - 5
Write a java program to determine whether the number is prime or not.
*/

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Input a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean x = true;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                x = false;
                break;
            }
        }
        System.out.println(x);
    }
}
