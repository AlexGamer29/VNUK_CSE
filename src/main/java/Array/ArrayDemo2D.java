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
public class ArrayDemo2D {
    
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
    
    public static void main(String[] args) {
        int row, col;
        int [][] array;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Row = ");
        row = inputNumber();
        
        System.out.print("Col = ");
        col = inputNumber();
        
        array = new int[row][col];
        
        System.out.println("Input array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Output:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
