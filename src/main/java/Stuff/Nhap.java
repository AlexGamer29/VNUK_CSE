package Stuff;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/** @author Hi there */
public class Nhap {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input, result = 0;
    System.out.println("Nhập vào n: ");
    input = sc.nextInt();

    boolean check = true;

    if (check) {
      while (input > 0) {
        int tmp = input % 10;
        input /= 10;
      }
    }
  }
}
