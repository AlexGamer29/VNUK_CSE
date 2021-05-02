/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MidtermTryOut;

import java.util.Scanner;

/** @author Hi there */
public class Ex1 {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào n: ");
	int input, sum = 0;
	input = sc.nextInt();
	
	for (int i = 1; i <= input; i++) {
	  if (i % 15 == 0) {
		sum += i;
	  }
	}
    System.out.println(sum);
  }
}
