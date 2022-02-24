package com.company;

import java.util.Scanner;

/*
Task - 3
A natural number N is given (entered from the keyboard). Calculate two to the power of N
Display the calculated value (1 <= N <= 15).
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = 1;
        if (n < 1 || n > 15){
            System.out.println("Number does not meet the condition.");
        } else {
            for (int i = 1; i <= n; i++){
                ret = ret * 2;
            }
        }
        System.out.println(ret);
    }
}
