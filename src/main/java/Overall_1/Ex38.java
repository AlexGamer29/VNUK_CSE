/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overall_1;

import java.util.Scanner;

/** @author Hi there */
public class Ex38 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input, sum;
    input = sc.nextInt();

    if (input < 2) {
      System.out.println(input + " không phải là số nguyên tố");
    } else {
      for (int i = 2; i < input; i++) {
        if (input % i == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }
}
