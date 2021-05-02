/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//13.	Nhập số nguyên n. Viết hàm tìm chữ số nhỏ nhất của số nguyên dương n (n > 0)

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex13 {

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

  static long findMinNumberOfInterger(long n) {
    long min = 0, separateNum;
    while (n > 0) {
      separateNum = n % 10;
      n /= 10;
      if (min > separateNum) {
        min = separateNum;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    int n = checkCondition();
    long result = findMinNumberOfInterger(n);
    System.out.println(result + " là chữ số nhỏ nhất");
  }
}
