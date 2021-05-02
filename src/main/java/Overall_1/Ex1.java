/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Nhập số nguyên n > 1
*/

package Overall_1;

import java.util.Scanner;

/** @author Hi there */
public class Ex1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int inputNum = 0, sum = 0;
    do {
      System.out.println("Nhập số nguyên: ");
      inputNum = sc.nextInt();
      if (inputNum < 1) {
        System.out.println("Nhập sai, nhập lại số nguyên > 1 \n");
      }
    } while (inputNum < 1);

    for (int i = 0; i <= inputNum; i++) {
      sum = (int) (sum + Math.pow(i, 2));
    }
    System.out.printf("Giá trị S = %d", sum);
  }
}
