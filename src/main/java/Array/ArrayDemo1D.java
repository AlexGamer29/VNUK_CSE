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
public class ArrayDemo1D {
    
    public static void main(String[] args) {
        //n > 0
        
        int n;
        int[] array; //khai bao
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.print("Please input number > 0: ");
            }
        } while(n <= 0);
        
        array = new int[n]; //khoi tao mang
           
        System.out.println("Input array");
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] = ", i);
            array[i] = sc.nextInt();
        }
        
        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    
}
