/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// 17.	Nhập số nguyên n > 100. Viết hàm kiểm tra các chữ số của số nguyên dương n có giảm dần từ trái sang phải hay không

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex17 {

  static int checkCondition() {
    Scanner sc = new Scanner(System.in);
    int n;
    do {
      System.out.println("Nhập vào n: ");
      n = sc.nextInt();
      if (n <= 100) {
        System.out.println("\nVui lòng nhập n > 100");
      }
    } while (n <= 100);
    return n;
  }

  static boolean checkDecreasingLtoR(int n) {
    int lastNum = n % 10;
    n /= 10;
    while (n != 0) {
      int separateNumber = n % 10;
      n /= 10;
      if (separateNumber < lastNum) {
        return false;
      } else {
        separateNumber = lastNum;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int n = checkCondition();

    if (checkDecreasingLtoR(n)) {
      System.out.println(n + " là số giảm dần từ trái sang phải ");
    } else {
      System.out.println(n + " không là số giảm dần từ trái sang phải");
    }
  }
}
