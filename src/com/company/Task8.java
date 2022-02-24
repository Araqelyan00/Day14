package com.company;

import java.util.Scanner;

/*
Task - 8
8.Enter the number N and draw an NxN checkerboard where the top left is white. Designate white
margins O, black margins X. Use a for loop.
Input ` 3       Input` 8
Output`         Output`
OXO             OXOXOXOX
XOX             XOXOXOXO
OXO             OXOXOXOX
                XOXOXOXO
                OXOXOXOX
                XOXOXOXO
                OXOXOXOX
                XOXOXOXO

*/
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0){
                    System.out.print("X");
                }else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
