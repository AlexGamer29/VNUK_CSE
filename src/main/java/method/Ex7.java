/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
7.	Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số chính phương hay không
*/

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex7 {

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

  static boolean isSquareNumber(int n) {
    double tmp = (int) Math.sqrt(n); // căn bậc hai của n
    if (n == tmp * tmp) { // có thể dùng phương thức Math.floor
      return true;
    }
    return false;
  }

  public static void main(String[] args) {

    int n = checkCondition();

    if (isSquareNumber(n)) {
      System.out.println(n + " is square number");
    } else {
      System.out.println(n + " is not square number");
    }
  }
}
