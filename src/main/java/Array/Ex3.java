/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 3. Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Liệt kê các vị trí mà giá trị tại đó là giá trị âm trong mảng 1 chiều.

package array;

/** @author Hi there  */

import java.util.Scanner;


/** @author Hi there */
public class Ex3 {

    static int[] inputArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\narr[%d] = %d", i, arr[i]);
        }
        System.out.println();
    }

    static void listNegativeValue(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.printf("%2d" + " ", i);
                count++;
            }
        }
        if (count == 0) {
            System.out.print("none");
        }
    }
    public static void main(String[] args) {
        int inputNum;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử: ");
            inputNum = sc.nextInt();
            if (inputNum <= 0) {
                System.out.println("\nVui lòng nhập vào số nguyên dương");
            }
        } while (inputNum <= 0);
        arr = inputArray(inputNum);

        System.out.print("\nMảng vừa nhập");
        outputArray(arr);

        System.out.print("\nCác vị trí chứa giá trị âm trong mảng 1 chiều là: ");
        listNegativeValue(arr);
    }
}