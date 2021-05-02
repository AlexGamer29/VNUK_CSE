/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loop;

import java.util.Scanner;

/** @author Hi there */
// Nhập vào số nguyên n, yêu cầu xuất ra bảng cửu chương thứ n
public class Ex4 {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int iNum;
    System.out.println("Nhập vào số nguyên n: ");
	iNum = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
	  int multipleResult = iNum * i;
  //  System.out.print(iNum + "*" + i + "=" + multipleResult + "\n");
      System.out.printf("%d*%d=%d" + "\n", iNum, i, multipleResult);
	}
  }
}
