/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch_case;

import java.util.Scanner;

/** @author Hi there */
/*
5.	Nhập vào ký tự A →  F hoặc a →  f. In ra học lực như sau:
	A hoặc a	: Excellent
	B hoặc b	: Good
	C hoặc c	: Pretty good
	D hoặc d	: Average
	F hoặc f	: Failed
	Ký tự khác	: UNKNOWN
*/
public class Ex5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Nhập vào ký tự A -> F hoặc a -> f: ");
    String inputString = sc.nextLine();
    switch (inputString) {
	  case "A", "a":
		System.out.println("Excellent");
		break;
	  case "B", "b":
		System.out.println("Good");
		break;
	  case "C", "c":
		System.out.println("Pretty Good");
		break;
	  case "D", "d":
		System.out.println("Average");
		break;
	  case "F", "f":
		System.out.println("Failed");
		break;
	  default:
		System.out.println("UNKNOWN");
		break;
	}
  }
}
