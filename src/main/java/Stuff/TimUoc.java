/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stuff;

import java.util.Scanner;

/** @author Hi there */
public class TimUoc {

  public static void main(String[] args) {
    System.out.println("Nhập vào n: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int count = 0;

    for (int i = 1; i <= n; i++) {
      if (n % i != 0) {
		break;
      } else {
        System.out.print(i + " ");
		count++;
      }
      System.out.println(count);
    }
  }
}
