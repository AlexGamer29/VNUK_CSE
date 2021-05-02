/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overall_1;

import java.util.Scanner;

/** @author Hi there */
/*
2.	Nhập số nguyên n > 0
*/
public class Ex2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum = 0;
    float sum = 0;
    do {
      System.out.println("Nhập số nguyên: ");
      inputNum = sc.nextInt();
      if (inputNum < 0) {
        System.out.println("Nhập sai, nhập lại số nguyên > 1 \n");
      }
    } while (inputNum < 0);

    for (int i = 1; i <= inputNum; i++) {
      sum += 1 / (float) i;
    }
    System.out.printf("Giá trị S = %f", sum);
  }
}
