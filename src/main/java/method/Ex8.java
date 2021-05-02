/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
8.	Nhập số nguyên n. Viết hàm đếm số lượng chữ số của số nguyên dương n (n > 0)
*/
package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex8 {

	static int checkCondition() {
		int n;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập vào n: ");
			n = sc.nextInt();
			if (n <= 0) {
        System.out.println("\nVui lòng nhập n > 0");
			}
		} while (n <= 0);
		return n;
	}
	
	static long countNumberOfInterger(long n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			n /= 10;
			count++;
		}
//		while (n > 0) {
//      n /= 10;
//      count++;
//    }
		return count;
	}
  
	public static void main(String[] args) {
		int n = checkCondition();
		long result = countNumberOfInterger(n);
    System.out.println("Số lượng chữ số của số " + n + " là " + result);
	}
}
