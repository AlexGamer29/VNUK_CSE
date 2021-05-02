/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stuff;

import java.util.Scanner;

/** @author Hi there */
public class nMu3 {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input, sum = 0;
    System.out.println("Nhập vào n: ");
	input = sc.nextInt();
	
	for (int i = 1; i <= input; i++) {
	  sum = (int) (sum + Math.pow(i, 3));
	}
    System.out.println("Kết quả là : " + sum);
 }
}
