/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MidtermTryOut;

import java.util.Scanner;

/** @author Hi there */
public class Ex2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float input;
    float sum = 0;

    do {
      System.out.print("Nhập vào số n với 0 < n <= 10: ");
      input = sc.nextInt();
      if (input <= 0 || input > 10) {   
        System.out.println("\n" + "Vui lòng nhập lại số n với 0 < n <= 10");
      }
    } while (input <= 0 || input > 10); // điều kiện nghịch đảo 0 < n <= 10

    for (int i = 1; i <= input; i++) {
      if (i / 2 != 0) {  // (-1) mũ n+1
        sum = sum + (float) (-1.0 / (2 * i - 1)); // n mũ lẻ thì = -1
      }
	  else {
		sum = sum + (float) (1.0 / (2 * i - 1)); // n mũ chẵn thì  = 1
	  }
    }
    System.out.println(sum);
  }
}
