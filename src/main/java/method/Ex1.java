/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1.Nhập số nguyên n > 1. Viết hàm tính S =1^2 + 2^2 + 3^2  + ...+ n^2  
*/

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex1 {
  
  static int checkCondition() {
	Scanner sc = new Scanner(System.in);
	int n;
    do {
      System.out.print("Nhập vào n: " + "\n");
      n = sc.nextInt();
      if (n <= 1) {
        System.out.println("\nVui lòng nhập n > 1 ");
      }
    } while (n <= 1);
	return n;
  }
  
  static int calculateSquareOfN(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += i * i; // (int) (sum + Math.pow(i, 2))
    }
    return sum;
  }

  public static void main(String[] args) {
	
	int n = checkCondition();
    
    int result = calculateSquareOfN(n);
    System.out.println("S = " + result);
  }
}
