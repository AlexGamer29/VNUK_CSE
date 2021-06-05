/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class ArrayDemo2D_Method {
    
    //>0
    static int inputNumber() {
        int n;
        
        Scanner sc = new Scanner(System.in);
        do {        
            n = sc.nextInt();
            if (n <= 0) {
                System.out.print("Please input number > 0: ");
            }
        } while(n <= 0);
        
        return n;
    }
    
    static int[][] inputArray(int row, int col) {
        int[][] array = new int[row][col];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
    
    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    static boolean isPerfectNumber(int n) {
        int s = 0;
        for (int i = 1; i <= n /2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        
        return s == n;
    }
    
    static void listPerfectNumbers(int[][] array) {
        int count = 0;
        System.out.print("Perfect numbers: ");
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (isPerfectNumber(array[i][j])) {
                    System.out.print(array[i][j] + "\t");
                    count++;
                }
            }
        }
        
        if (count == 0) {
            System.out.println("none");
        }
    }
    
    public static void main(String[] args) {
        int row, col;
        int [][] array;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Row = ");
        row = inputNumber();
        
        System.out.print("Col = ");
        col = inputNumber();
        
        System.out.println("Input array");
        array = inputArray(row, col);
        
        System.out.println("Output:");
        printArray(array);
        
        listPerfectNumbers(array);
    }
}
