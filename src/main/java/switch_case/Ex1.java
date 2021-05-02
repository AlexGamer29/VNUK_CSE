/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch_case;

import java.util.Scanner;

/** @author Hi there */
/*
Viết chương trình nhập số nguyên n (1 → 10) và in ra từ tiếng anh tương ứng
	Ví dụ: n = 3 → THREE
		n = 9 → NINE
		n = 11 → UNKNOW
*/
public class Ex1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Nhập vào một số nguyên từ 1 đến 10: ");
    num = sc.nextInt();

    switch (num) {
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;
      case 10:
        System.out.println("TEN");
        break;
      case 11:
        System.out.println("UNKNOWN");
        break;
    }
  }
}
