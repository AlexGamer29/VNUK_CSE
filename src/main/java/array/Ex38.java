// 38.	Nhập ma trận n hàng, m cột (n > 0, m > 0). 
// Kiểm tra ma trận có toàn dương hay không

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex38 {

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

    static boolean isPositive2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int row, col;
        int[][] arr;

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

        if (isPositive2DArray(arr)) {
            System.out.print("\nMa trận toàn dương");
        } else {
            System.out.print("\nMa trận không toàn dương");
        }
    }
}
