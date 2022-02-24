package com.company;

import java.util.Scanner;

/*
Task - 10
A natural number> = 2 is specified. Expand it into prime factors.
Example` Input` 120 2*2*2*3*5
*/
public class Task10 {
    public static boolean primeNumber(int number) {
        boolean x = true;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                x = false;
                break;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str = "";
        int n = number;
        int i = 2;
        while (!primeNumber(n)) {
            if (n % i == 0 && primeNumber(i)) {
                str += i + "*";
                n = n / i;
            } else i++;

        }
        System.out.println(str + n);
    }
}
