/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 18.	Liệt kê tất cả các số nguyên tố nhỏ hơn n (Sử dụng hàm kiểm tra số nguyên tố)

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex18 {
	
	static int inputNum() {
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
	
	static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

  public static void main(String[] args) {
		int n = inputNum();
		
		for (int i = 0; i < n; i++) {
			if(isPrimeNumber(i)) {
				System.out.println("Tất cả các số nguyên tố nhỏ hơn " + n + " là " + i);
			}
    }
	}
}
