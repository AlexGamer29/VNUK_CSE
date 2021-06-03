// 31.	Nhập ma trận n hàng, m cột (n > 0, m > 0).
// In ra mang trận vừa nhập và tổng các phần tử chẵn của ma trận

package array;

import java.util.Scanner;

public class Ex31 {

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
    int sumEven = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if(arr[i][j] % 2 == 0) {
          sumEven += arr[i][j];
        }
      }
    }
    return sumEven;
  }

  public static void main(String[] args) {
    int row, col;
    int[][] arr;
    int sumEven;

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

    sumEven = isEvenNumber(arr);
    System.out.print("\nTổng các phần tử chẵn của ma trận là: ");
    System.out.print(sumEven);

  }
}
