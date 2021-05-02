/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overall_1;

import java.util.Scanner;

/** @author Hi there */
/*
5.	Nhập số nguyên n (0 < n <= 10). Tính S = 1 + 1.2 + 1.2.3 + 1.2.3.4 + … + 1.2.3...n
*/
public class Ex5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum = 0;
    int sum = 0, multiply = 1;

    do {
      System.out.println("Nhập số nguyên: "); // nhập số kiểm tra đk
      inputNum = sc.nextInt();
      if (inputNum > 10 || inputNum <= 0) {
        System.out.println("Nhập sai, nhập lại số nguyên > 1 \n");
      }
    } while (inputNum > 10 || inputNum <= 0);

    for (int i = 1; i <= inputNum; i++) { // tính giai thừa n
      multiply *= i;
      sum += multiply;
    }

    System.out.printf("Giá trị S = %d", sum);
  }
}
