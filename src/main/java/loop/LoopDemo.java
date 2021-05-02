/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loop;

import java.util.Scanner;

/** @author Hi there */
public class LoopDemo {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n, sum = 0;
	
	do {
		System.out.print("Num: ");
		n = sc.nextInt();
		if (n < 10) {
        System.out.println("Please enter a number >= 10.");
		}
	} while (n < 10);
	
	int i = 0;
	while (i <= n) {
	  sum += i * i;
	  i++;
	}
    System.out.println("Sum while: " + sum);
	
	sum = 0;
	do {
	  sum += i*i;
	  i++;
	} while (i <= n);
    System.out.println("Sum do-while: " + sum);
	
	sum = 0;
	i = 0;
	do {
	  if (i % 2 != 0) {
		sum += i*i;
		i++;
	  }
	} while (i <=n);
	System.out.println("Sum do-while check odd number: " + sum);
	
	sum = 0;
    for (i = 0; i <= n; i++) {
	  sum += i*i;
	}
    System.out.println("Sum for: " + sum);
  }
}
