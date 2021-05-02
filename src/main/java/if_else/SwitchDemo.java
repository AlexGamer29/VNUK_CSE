/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if_else;

import java.util.Scanner;

/** @author Hi there */
public class SwitchDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.println("n = ");
    n = sc.nextInt();

    switch (n) {
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
	  default:
        System.out.println("UNKNOWN");
    }
  }
}
