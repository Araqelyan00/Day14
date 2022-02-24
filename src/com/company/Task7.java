package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
Task - 7
A three-letter word is given. The word consists only of Latin letters, small and large. Print the
same word, where the first letter is capitalized, the rest are small.
Example` dog     Dog
         CAT     Cat
         Lip     Lip
*/
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str.toUpperCase(Locale.ROOT).substring(0, 1) + str.toLowerCase(Locale.ROOT).substring(1));
    }
}
