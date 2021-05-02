/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loop;

import java.util.Scanner;

/** @author Hi there */
// Nhập 1 số nguyên n, xuất tổng từ 1 đến n
public class Ex1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int inputNum, sum = 0;
    System.out.println("Nhập vào số nguyên n: ");
    inputNum = sc.nextInt();

    for (int begin = 1; begin <= inputNum; begin++) {
      sum = sum + begin;
    }
    System.out.printf("Tổng là %d", sum);
  }
}
