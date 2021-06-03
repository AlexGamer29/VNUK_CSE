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
    // căn bậc hai của n
    double tmp = (int) Math.sqrt(n); 
    // có thể dùng phương thức Math.floor (tmp - Math.floor(tmp) == 0)
    if (n == tmp*tmp) { 
      return true;
    }
    return false;
  }

  public static void main(String[] args) {

    int n = checkCondition();

    if (isSquareNumber(n)) {
      System.out.println(n + " là số chính phương");
    } else {
      System.out.println(n + " không là số chính phương");
    }
  }
}
