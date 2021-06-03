/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//4.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Liệt kê các phần tử là số nguyên tố

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex4 {

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

    static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void listPrimeNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                System.out.print(arr[i] + "  ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("none");
        }
    }

    public static void main(String[] args) {
        int inputNum;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào n: ");
            inputNum = sc.nextInt();
            if (inputNum <=0) {
                System.out.println("\nVui lòng nhập n > 0");
            }
        } while (inputNum <=0);

        System.out.println("\nNhập vào từng phần tử của mảng");
        arr = inputArray(inputNum);

        System.out.print("\nMảng vừa nhập");
        outputArray(arr);

        System.out.print("\nPhần tử là số nguyên tố: ");
        listPrimeNumber(arr);
    }
}
