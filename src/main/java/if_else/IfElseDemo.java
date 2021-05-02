/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if_else;

import java.util.Scanner;

/** @author Hi there */
public class IfElseDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Number: ");
    n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println(n + " is even number");
    } else {
      System.out.println(n + " is odd number");
    }

    System.out.println("ax + b = 0");
    int a, b;
    System.out.println("a = ");
    a = sc.nextInt();

    System.out.println("b = ");
    b = sc.nextInt();

    if (a == 0) {
      if (b == 0) {
        System.out.println("Vô số nghiệm");
      } else {
        System.out.println("Vô nghiệm");
      }
    } else {
      System.out.println("x = " + -b * 1.0f / a); //Để lấy phần thập phân của số int thì *1.0f
    }
  }
}
