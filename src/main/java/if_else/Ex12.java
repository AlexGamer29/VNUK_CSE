/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if_else;

import java.util.Scanner;

/** @author Hi there */
/*
Viết chương trình phải phương trình bậc 2: ax2 + bx + c = 0 (a # 0)
Đầu vào: nhập 3 số a, b, c (a # 0) (Khai báo kiểu float)
Đầu ra: nghiệm của phương trình
Hướng dẫn: Sử dụng lớp Math.xxx() để sử dụng các hàm sẵn
Ví dụ: Math.sqrt(123) tính căn bậc 2 của số 123
*/
public class Ex12 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float a, b, c;
    float resultVar1, resultVar2;
    System.out.println("Nhập vào a: ");
    a = sc.nextFloat();
    System.out.println("Nhập vào b: ");
    b = sc.nextFloat();
    System.out.println("Nhập vào c: ");
    c = sc.nextFloat();

    float delta = b * b - 4 * a * c;
    if (delta < 0) {
      System.out.println("Phương trình vô nghiệm");
    } else if (delta == 0) {
      resultVar1 = (-b) / 2 * a;
      System.out.printf("Phương trình có nghiệm kép x1 = x2 = %f", resultVar1);
    } else {
      resultVar1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
	  resultVar2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
	  System.out.printf("Phương trình có hai nghiệm x1 = %f, x2 = %f", resultVar1, resultVar2);
    }
  }
}
