/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overall_1;

import java.util.Scanner;

/** @author Hi there */
/*
22.	Nhập số nguyên n. Hãy tính tổng các chữ số của số nguyên dương n (n > 0)
*/
public class Ex22 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum = 0;
    long multiply = 1;

    do {
      System.out.println("Nhập số nguyên: "); // nhập số kiểm tra đk
      inputNum = sc.nextInt();
      if (inputNum <= 0) {
        System.out.println("Nhập sai, nhập lại số nguyên > 0 \n");
      }
    } while (inputNum <= 0);

    while (inputNum > 0) {
      int remainder = inputNum % 10;
      multiply = multiply + remainder;
      inputNum = inputNum / 10;
    }
    System.out.println("Tích các chữ số là " + multiply);
  }
}
