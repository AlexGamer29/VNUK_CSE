// 34.	Nhập ma trận n hàng, m cột (n > 0, m > 0). 
// Đếm số lượng số nguyên tố trong ma trận

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex34 {

    static int[][] inputArray(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void outputArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
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

    static int countPrimeNumber(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (isPrimeNumber(arr[i][j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int row, col;
        int[][] arr;
        int numberofPrimeNum;
        
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số hàng: ");
            row = sc.nextInt();
            System.out.println("Nhập vào số cột: ");
            col = sc.nextInt();
            if (row <= 0 || col <= 0) {
                System.out.println("\nVui lòng nhập lại số hàng và số cột");
            }
        } while (row <= 0 || col <= 0);

        arr = inputArray(row, col);

        System.out.println("\nMảng vừa nhập: ");
        outputArray(arr);

        numberofPrimeNum = countPrimeNumber(arr);
        System.out.print("\nSố lượng số nguyên tố trong ma trận: " + numberofPrimeNum);
        

    }
}
