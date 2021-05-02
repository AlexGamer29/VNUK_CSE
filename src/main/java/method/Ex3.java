/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
3.	Viết hàm tính tổng tất cả các “ước số” của số nguyên dương n (n > 0)
*/

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex3 {
  
  static int checkCondition() {
	Scanner sc = new Scanner(System.in);
	int n;
	do {
	  System.out.println("Nhập vào n: ");
	  n = sc.nextInt();
	  if (n <= 0) {
		System.out.println("\nVui lòng nhập số n > 0");
	  }
	} while (n <= 0);
	return n;
  }
  
  static int sumOfDivisors(int n) {
	int count = 0;
	for (int i = 1; i <= n; i++) {
	  if (n % i == 0) {
		count += i;
	  }
	}
	return count;
  }
  
  public static void main(String[] args) {
	int n = checkCondition();
	int result = sumOfDivisors(n);
    System.out.println("S = " + result);
  }
}
