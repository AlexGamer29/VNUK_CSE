/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overall_1;

import java.util.Scanner;

/** @author Hi there */
/*
27.	Nhập số nguyên n. Hãy tìm số đảo ngược của số nguyên dương n (n > 0)
*/
public class Ex27 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum, result = 0;
    inputNum = sc.nextInt();

    while (inputNum > 0) {
      int temp = inputNum % 10;
      result = result % 10 + temp;
      inputNum /= 10;
    }
    System.out.println(result);
  }
}
