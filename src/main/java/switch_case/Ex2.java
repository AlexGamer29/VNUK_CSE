/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch_case;

import java.util.Scanner;

/** @author Hi there */
/*
2.	Viết chương trình nhập vào số nguyên 4 (1 → 4) và in ra mùa tương ứng
	Ví dụ:
		n = 1 → XUAN
		n = 2 → HA
		n = 3 → THU
		n = 4 → DONG
		n = 5 → UNKNOW
*/
public class Ex2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.println("Nhập vào một số nguyên từ 1 đến 4: ");
    num = sc.nextInt();

    switch (num) {
      case 1:
        System.out.println("XUAN");
        break;
      case 2:
        System.out.println("HA");
        break;
      case 3:
        System.out.println("THU");
        break;
      case 4:
        System.out.println("DONG");
        break;
      case 5:
        System.out.println("UNKNOWN");
        break;
    }
  }
}
