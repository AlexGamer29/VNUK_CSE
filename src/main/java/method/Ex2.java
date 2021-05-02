/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
2.	Nhập số nguyên n (0 < n <= 10). Viêt hàm tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n
*/
package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex2 {
  
  static int checkCodition() {
	Scanner sc = new Scanner(System.in);
	int n;
	do {
	  System.out.print("Nhập vào n: ");
	  n = sc.nextInt();
	  if (n <= 0 || n > 10) {
		System.out.println("\nVui lòng nhập số 0 < n <= 10");
	  }
	} while (n <= 0 || n > 10);
	return n;
  }
  
  static int calculateSumOfMultiply(int n) {
	int sum = 0, multiply = 1;
	for (int i = 1; i <= n; i++) {
	  multiply *= i;
	  sum += multiply;
	}
	return sum;
  }
 
  public static void main(String[] args) {
	int n = checkCodition();
	
	int result = calculateSumOfMultiply(n);
    System.out.println("S = " + result);
  }
}
