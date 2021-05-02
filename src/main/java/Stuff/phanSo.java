/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stuff;

import java.util.Scanner;

/** @author Hi there */
public class phanSo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float input, sum = 0;
    System.out.println("Nhập vào n: ");
    input = sc.nextFloat();

    for (int i = 0; i <= input; i++) {
      sum = sum + (float) (2 * i + 1) / (2 * i + 2);
    }
    System.out.println("Đáp án " + sum);
  }
}
