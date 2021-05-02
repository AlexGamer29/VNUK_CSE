/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
9.	Nhập số nguyên n. Viết hàm tính tổng các chữ số của số nguyên dương n (n > 0)
*/

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex9 {

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

  static long sumNumberOfInterger(long n) {
    int sum = 0, separateNum;
    for (; n != 0; ) {
      separateNum = (int) (n % 10); // tách số cuối trong dãy ( phần dư )
			sum += separateNum;	// cộng số đó vào tổng
      n = n / 10; // tách lấy số ngoài số cuối
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = checkCondition();
    long result = sumNumberOfInterger(n);
    System.out.println("Tổng các chữ số của " + n + " là " + result);
  }
}
