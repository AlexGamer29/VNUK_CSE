/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 19.	Liệt kê tất cả các số chính phương nhỏ hơn n(Sử dụng hàm kiểm tra số chính phương)

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex19 {

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
    // có thể dùng phương thức Math.floor
    if (n == tmp * tmp) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {

    int n = checkCondition();

    System.out.print("Tất cả các số chính phương nhỏ hơn " + n + " là ");
    System.out.println();
    for (int i = 0; i < n; i++) {
      if (isSquareNumber(i)) {
        System.out.print(i + "\t");
      }
    }
  }
}
