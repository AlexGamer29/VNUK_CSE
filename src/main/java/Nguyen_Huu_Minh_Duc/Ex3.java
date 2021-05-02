/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nguyen_Huu_Minh_Duc;

import java.util.Scanner;

/** @author Hi there */
public class Ex3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numInput, temp, newNumber = 0, reversedNumber;
    System.out.println("Type an integer number: ");
    numInput = sc.nextInt();

    reversedNumber = numInput;
    while (numInput > 0) {
      temp = numInput % 10;
      newNumber = newNumber * 10 + temp;
      numInput /= 10;
    }
    if (reversedNumber == newNumber) {
      System.out.print(reversedNumber + " is a symmetry number");
    } else {
      System.out.print(reversedNumber + " is not a symmetry number");
    }
  }
}
