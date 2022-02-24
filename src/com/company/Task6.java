package com.company;

import java.util.Scanner;

/*
Task - 6
You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A
to B, the record of which is a palindrome.
Example` 1600 1661
         2100 1771
              1881
              1991
              2002
*/
public class Task6 {
    public static boolean NumIsPalindrome(int num) {
        int input = num;
        int n = 0;
        while (input != 0) {
            n = n * 10 + input % 10;
            input /= 10;
        }
        return num == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++){
            if (NumIsPalindrome(i)){
                System.out.println(i);
            }
        }
    }
}
