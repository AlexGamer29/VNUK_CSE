// 36.	Nhập ma trận n hàng, m cột (n > 0, m > 0). 
// Nhập vào chỉ số cột, tính tích các giá trị dương trên cột đó trong ma trận 

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex36 {
    
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

    static int calculateMultiplyOfLineInArray(int[][] arr, int col) {
        int multipleOfLine = 1;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i][col - 1] > 0) {
                    multipleOfLine *= arr[i][col - 1];
                }
        }
        return multipleOfLine;
    }

    public static void main(String[] args) {
        int row, col;
        int[][] arr;
        int multipleOfLine, inputCol;

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
            System.out.println("\nNhập vào số cột bạn muốn tính tích: ");
            inputCol = sc.nextInt();
            if (inputCol <= 0) {
                System.out.println("\nVui lòng nhập lại số hàng > 0");
            }
        } while (inputCol <= 0);

        multipleOfLine = calculateMultiplyOfLineInArray(arr, inputCol);
        System.out.print("\nTích các giá trị dương trên cột " + inputCol + " là " + multipleOfLine);
    }
}
