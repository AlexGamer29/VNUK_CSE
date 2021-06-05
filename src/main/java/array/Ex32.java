package array;

import java.util.Scanner;

public class Ex32 {

    public static int[][] inputArray(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int isEvenNumber(int[][] arr) {
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    sumOdd += arr[i][j];
                }
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        int row, col;
        int[][] arr;
        int sumOdd;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào hàng: ");
            row = sc.nextInt();
            System.out.println("Nhập vào cột: ");
            col = sc.nextInt();
            if (row <= 0 || col <= 0) {
                System.out.println("\nNhập lại hàng và cột > 0");
            }
        } while (row <= 0 || col <= 0);

        arr = inputArray(row, col);

        System.out.println("\nMảng vừa nhập là: ");
        printArray(arr);

        sumOdd = isEvenNumber(arr);
        System.out.print("\nTổng các phần tử lẻ của ma trận là: ");
        System.out.print(sumOdd);
    }
} 

