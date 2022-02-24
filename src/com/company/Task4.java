package com.company;

import java.util.Scanner;
/*
Task - 4
Given number n. N minutes have passed since the beginning of the day. Determine how many
hours and minutes the digital clock will show at this moment. The program should print two
numbers: the number of hours (from 0 to 23) and the number of minutes (from 0 to 59). Note that
the number n can be more than the number of minutes in a day.
*/
public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hours = 0;
        int day = 0;
        for (int i = 0; i <= n; i++){
            if (i == 60){
                n = n - 60;
                i = 0;
                hours++;
            }
            if (hours >= 24){
                hours = 0;
                day++;
            }
        }
        System.out.println(hours + ":" + n);
    }

}
