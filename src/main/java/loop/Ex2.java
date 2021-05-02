/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loop;

import java.util.Scanner;

/** @author Hi there */
// Nhập 1 số nguyên n, xuất tổng các số lẻ từ 1 đến n
public class Ex2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int inputNum, sum = 0;
    System.out.println("Nhập vào số nguyên n: ");
    inputNum = sc.nextInt();

    for (int beginNumber = 1; beginNumber <= inputNum; beginNumber++) {
      if (beginNumber % 2 != 0) //số lẻ
		sum = sum + beginNumber;  // sum += beginNumber   beginNumber += 2
    }
    System.out.printf("Tổng là %d", sum);
  }
}
