/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loop;

import java.util.Scanner;

/** @author Hi there */
/*
6.	Viết chương trình tính:
		n!! = 1 * 3 * 5 *… * n (nếu n lẻ)
                            = 2 * 4 * 6 * … *n (nếu n chẵn)
	Ví dụ: n = 7 → n!! = 1 * 3 * 5 * 7 = 105
		n = 6 → n!! = 2 * 4 * 6 = 48
*/
public class Ex6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nhập vào số n: ");
    int num = sc.nextInt();

    //	for (int i = 1; i <= num; i++) {
    //	  if(num % 2 == 0) {
    //		num = (num + 1) * i;
    //        System.out.println(num);
    //		break;
    //	  } else {
    //		num = (num - 1) * i;
    //		System.out.println(num + "!! = " + "là" + num);
    //		break;
    //	  }
    //	}
    int result = 1;
    for (int i = num; i >= 1; i -= 2) {
      result *= i;
    }
    System.out.println(num + "!! = " + "là " + result);
  }
}
