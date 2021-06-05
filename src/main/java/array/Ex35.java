// 35.	Nhập ma trận n hàng, m cột (n > 0, m > 0). 
// Nhập vào chỉ số dòng, tính tổng các giá trị trên dòng đó trong ma trận

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex35 {

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

    static int calculateSumOfLineInArray(int[][] arr, int row) {
        int sumOfLine = 0;
        for (int i = row + 1; i <= row + 1;) {
            for (int j = 0; j < arr[0].length; j++) {
                sumOfLine += arr[row - 1][j];
            }
            break;
        }
        return sumOfLine;
    }

    public static void main(String[] args) {
        int row, col;
        int[][] arr;
        int sumOfLine, inputRow;

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

        do {
            System.out.println("Nhập vào số hàng bạn muốn tính tổng: ");
            inputRow = sc.nextInt();
            if (inputRow <= 0) {
                System.out.println("\nVui lòng nhập lại số hàng > 0");
            }
        } while (inputRow <= 0);

        sumOfLine = calculateSumOfLineInArray(arr, inputRow);
        System.out.print("\nTổng các giá trị trên dòng " + inputRow + " là " + sumOfLine);
    }
}
