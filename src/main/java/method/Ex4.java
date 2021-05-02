/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
4.	Viết hàm đếm số lượng “ước số” của số nguyên dương n (n > 0)
*/

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex4 {
  
  static int checkCondition() {
	Scanner sc = new Scanner(System.in);
	int n;
	do {
	  System.out.println("Nhập vào n: ");
	  n = sc.nextInt();
	  if (n <= 0) {
        System.out.println("\nVui lòng nhập n > 0");
	  }
	} while (n <= 0);
	return n;
  }
  
  static int numberOfDivisors(int n) {
	int count = 0;
	for (int i = 1; i <= n; i++) {
	  if (n % i == 0) {
		count++;
	  }
	}
	return count;
  }

  public static void main(String[] args) {
	int n = checkCondition();
	int result = numberOfDivisors(n);
    System.out.println("Số lượng ước số của " + n + " là " + result);
  }
}
