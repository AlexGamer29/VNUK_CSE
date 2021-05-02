/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nguyen_Huu_Minh_Duc;

import java.util.Scanner;

/** @author Hi there */
public class Ex1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input, sum = 0;
    do {
      System.out.print("Please type a number > 0: ");
      input = sc.nextInt();
      if (input <= 0) { 
        System.out.println("n is not > 0. Type again: ");
      }
    } while (input <= 0); // điều kiện nghịch đảo > 0

    for (int i = 0; i <= input; i++) {
      if (i % 15 == 0) {  // số chia hết cho 3 và 5 thì suy ra chia hết cho 15
        sum += i;
      }
    }
    System.out.println("Result: " + sum);
  }
}
