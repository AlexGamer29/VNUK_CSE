// 33.	Nhập ma trận n hàng, m cột (n > 0, m > 0). 
// Tìm giá trị lớn nhất và nhỏ nhất của ma trận

package array;

import java.util.Scanner;

public class Ex33 {

    public static int[][] inputArray(int row, int col) {
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

    public static void outputArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int isHighestValue(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int isLowestValue(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int row, col;
        int[][] arr;
        int min, max;

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

        max = isHighestValue(arr);
        System.out.print("\nGiá trị lớn nhất là: " + max);

        min = isLowestValue(arr);
        System.out.print("\nGiá trị nhỏ nhất là: " + min);
    }
}
