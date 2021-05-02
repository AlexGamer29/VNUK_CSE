/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overall_1;

import java.util.Scanner;

/** @author Hi there */
/*
4.	Nhập số nguyên n > 0.
*/
public class Ex4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum = 0;
    double sum = 1.0;
    do {
      System.out.println("Nhập số nguyên: ");
      inputNum = sc.nextInt();
      if (inputNum < 0) {
        System.out.println("Nhập sai, nhập lại số nguyên > 1 \n");
      }
    } while (inputNum < 0);

    for (int i = 1; i <= inputNum; i++) {
      sum = sum + 1.0 / ((2 * i) + 1);
    }
    System.out.printf("Giá trị S = %f", sum);
  }
}
