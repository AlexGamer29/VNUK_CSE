// 37.	Nhập ma trận n hàng, m cột (n > 0, m > 0). 
// Tính tổng các giá trị nằm trên biên của ma trận

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex37 {

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

    static int sumOfElementsInBorder(int[][] arr, int row, int col) {
        /**
         * đường biên ngang có tọa độ là : i=0 và i=n-1 
         * đường biên dọc có tọa độ là:    j=0 và j=m-1 ( chú ý đừng để tính 4 góc 2 lần )
         */

        int sum = 0;
        for (int i = 0; i < col; i++) {
            sum += arr[0][i];
            sum += arr[row - 1][i];
        }
        for (int i = 1; i < row - 1; i++) {
            sum += arr[i][0];
            sum += arr[i][col - 1];
        }
        return sum;
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

        int sumOfBorder = sumOfElementsInBorder(arr, row, col);
        System.out.print("\nTổng các giá trị biên là: " + sumOfBorder);
    }
}
