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
public class ArrayDemo1D_Method {

    static int[] inputArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] = ", i);
            array[i] = sc.nextInt();
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    static boolean isPerfectNumber(int n) {
        int s = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s == n;
    }

    static void listPerfectNumber(int[] array) {
        int count = 0;
        System.out.print("Perfect numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isPerfectNumber(array[i])) {
                System.out.print(array[i] + "\t");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("none");
        }
    }

    public static void main(String[] args) {
        // n > 0

        int n;
        int[] array; // khai bao

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.print("Please input number > 0: ");
            }
        } while (n <= 0);

        System.out.println("Input array");
        array = inputArray(n);

        System.out.print("Output: ");
        printArray(array);

        System.out.println();
        listPerfectNumber(array);
    }

}
