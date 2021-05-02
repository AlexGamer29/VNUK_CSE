/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loop;

import java.util.Scanner;

/** @author Hi there */
/*
5.	Nhập vào số n, tính giai thừa của n
	n!= 1 x 2 x 3 x 4 x …x n
*/
public class Ex5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int iNum, factorialResult = 0;
    System.out.println("Nhập vào số n: ");
    iNum = sc.nextInt();
	factorialResult = 1;

    for (int i = 1; i <= iNum; i++) {
      factorialResult *= i; // factorialResult = factorialResult * i;
    }
    System.out.printf("n! = " + " %d ", factorialResult);
  }
}
