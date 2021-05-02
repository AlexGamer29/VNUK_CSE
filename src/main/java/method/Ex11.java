/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//11.	Nhập số nguyên n. Viết hàm tìm số đảo ngược của số nguyên dương n (n > 0)

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex11 {

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
	
	static long reversedNumber(long n) {
		int tmp, newNumber = 0;
		while (n > 0) {
			tmp = (int) (n % 10);
			newNumber = newNumber * 10 + tmp;
			n /= 10;
		}
		return newNumber;
	}
  
	public static void main(String[] args) {
		int n = checkCondition();
		long result = reversedNumber(n);
    System.out.println("Số đảo ngược của " + n + " là " + result);
	}
}
