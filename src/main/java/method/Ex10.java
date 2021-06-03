/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
10.	Nhập số nguyên n. Viết hàm đếm số lượng chữ số lẻ của số nguyên dương n (n > 0)
*/

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex10 {

	public static int checkCondition() {
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

	public static long countOddNumberOfInterger(long n) {
		int count = 0;
		for ( ; n != 0; ) {
			int separateNum = (int) (n % 10);
			if (separateNum % 2 == 1) {
				count++;
			}
			n /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = checkCondition();
		long countOddNum = countOddNumberOfInterger(n);
		System.out.println("Số lượng chữ số lẻ của số " + n + " là " + countOddNum);
	}
}
