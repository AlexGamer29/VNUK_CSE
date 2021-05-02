/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Viết chương trình phải phương trình bậc 2: ax2 + bx + c = 0
Đầu vào: nhập 3 số a, b, c  (a, b, c là số bất kỳ)
Đầu ra: nghiệm của phương trình
Hướng dẫn:
	Nếu a # 0 thì trở thành phương trình bậc 2 (chuẩn)
	Ngược lại, thì trở thành phương trình bậc nhất
*/

package if_else;

import java.util.Scanner;

/** @author Hi there */
public class Ex13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double a, b, c;
    double resultVar1, resultVar2;
    System.out.println("Nhập vào a: ");
    a = sc.nextFloat();
    System.out.println("Nhập vào b: ");
    b = sc.nextFloat();
    System.out.println("Nhập vào c: ");
    c = sc.nextFloat();

    double delta = b * b - 4 * a * c;
    if (a != 0) {
      if (delta < 0) {
        System.out.println("Phương trình bậc 2 vô nghiệm");
      } else if (delta == 0) {
        resultVar1 = resultVar2 = (-b) / 2 * a;
        System.out.printf("Phương trình bậc 2 có nghiệm kép x1 = x2 = %f", resultVar1);
      } else if (delta > 0) {
        resultVar1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
        resultVar2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
        System.out.printf("Phương trình bậc 2 có hai nghiệm x1 = %f, x2 = %f", resultVar1, resultVar2);
      } 
    } else { // a = 0
		if (b == 0) {
			if (c == 0) {
				System.out.println("Phương trình bậc nhất vô số nghiệm"); // b = 0, c = 0
			} else {
				System.out.println("Phương trình bậc nhất vô nghiệm"); // b = 0, c # 0
			}
		} else {
			int x = (int) (-c / b); //* 1.0f 
			System.out.printf("Phương trình bậc nhất có 1 nghiệm là: %d", x); // b # 0
		}
    }
  }
}
  
