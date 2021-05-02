package Stuff;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author Hi there */
public class PhepTinhHaiSo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();
    double thuong = a / b;
    System.out.print(a + b);
    System.out.print(a - b);
    System.out.print(a * b);
    System.out.printf("%2.0f", thuong);
  }
}
