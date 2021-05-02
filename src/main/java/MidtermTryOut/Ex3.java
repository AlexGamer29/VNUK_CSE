/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MidtermTryOut;

import java.util.Scanner;

/** @author Hi there */
public class Ex3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input, tmp;

    System.out.print("Nhập vào số n: ");
    input = sc.nextInt();
    System.out.println(input);
  }
}
		
	
		
		
		

//	int n;
//    boolean res;
//    Scanner sc;
//    do {
//      System.out.print("Input n = ");
//      sc = new Scanner(System.in);
//      n = sc.nextInt();
//    } while (n <= 0);
//
//    res = is_up_num(n);
//    if (res) {
//      System.out.println("The digits of " + n + " is constantly increasing");
//    } else {
//      System.out.println("The digits of " + n + " is not constantly increasing");
//    }
//
//    sc.close();
//  }
//
//  public static boolean is_up_num(int n) {
//    int temp = n % 10;
//    n /= 10;
//    while (n > 0) {
//      if (temp > n % 10) {
//        temp = n % 10;
//      } else {
//        return false;
//      }
//      n /= 10;
//    }
//    return true;
//  }
// }
