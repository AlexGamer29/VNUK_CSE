/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//12.	Nhập số nguyên n. Viết hàm tìm chữ số lớn nhất của số nguyên dương n (n > 0)

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex12 {

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

  static long findMaxNumberOfInterger(long n) {
    long max = 0, separateNum;
    while (n > 0) {
      separateNum = n % 10;
      n /= 10;
      if (max < separateNum) {
        max = separateNum;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int n = checkCondition();
    long result = findMaxNumberOfInterger(n);
    System.out.println(result + " là chữ số lớn nhất");
  }
}
