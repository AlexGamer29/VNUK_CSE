/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//15.	Nhập số nguyên n. Viết hàm kiểm tra số nguyên dương n có toàn chữ số chẵn hay không

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex15 {

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

  static boolean isWholeEvenNumber(int n) {
    int separateNumber;
    while (n > 0) {
      separateNumber = n % 10;
      n /= 10;
      if (separateNumber % 2 == 0) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int n = checkCondition();

    if (isWholeEvenNumber(n)) {
      System.out.println(n + " là số có toàn chữ số chẵn");
    } else {
      System.out.println(n + " không là số có toàn chữ số chẵn");
    }
  }
}
