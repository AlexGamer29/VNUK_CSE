/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/** @author Hi there */
/*
Viết chương trình giải phương trình bậc nhất: ax + b = 0
Đầu vào: nhập 2 số a, b (Khai báo kiểu float)
Đầu ra: nghiệm của phương trình
 */
public class Ex4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float a = 0, b = 0, x;
    System.out.print("Nhập vào hệ số a: ");
    a = sc.nextFloat();
    System.out.print("Nhập vào hệ số b: ");
    b = sc.nextFloat();
    x = -b / a;

    if (a == 0) {
      if (b == 0) {
        System.out.println("Phương trình vô số nghiệm");
      } else {
        System.out.println("Phương trình vô nghiệm");
      }
    } else {
      System.out.printf("Nghiệm của phương trình %.2fx + %.2f là: %.2f ", a, b, x);
    }
  }
}
