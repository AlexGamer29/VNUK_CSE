/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 2.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). In ra mảng vừa nhập và
// tổng các phần tử chẵn của mảng

package Array;

import java.util.Scanner;

/** @author Hi there */
public class Ex2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum, sumOdd = 0;
    do {
      System.out.println("Nhập vào số phần tử: ");
      inputNum = sc.nextInt();
      if (inputNum <= 0) {
        System.out.println("\nVui lòng nhập vào số nguyên dương");
      }
    } while (inputNum <= 0);
    int[] arr = new int[inputNum];

    for (int i = 0; i < inputNum; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Các phần tử của mảng là: ");
    for (int i = 0; i < inputNum; i++) {
      System.out.print(arr[i] + " ");
    }

    for (int i = 0; i < inputNum; i++) {
      if (arr[i] % 2 == 0) {
        sumOdd += arr[i];
      }
    }
    System.out.println("\nTổng các phần tử chẵn của mảng là: " + sumOdd);
  }
}
