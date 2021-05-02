/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package method;

/** @author Hi there */
public class MethodDemo {

  static int add(int a, int b) {
    return a + b;
  }

  static boolean isPrimeNumber(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    //	new MethodDemo().isPrimeNumber(3);
    add(10, 20);
    int s = add(100, 200);
    System.out.println("Sum: " + s);

    int n = 4;
    if (isPrimeNumber(n)) {
      System.out.println(n + " is prime number");
    } else {
      System.out.println(n + " is not prime number");
    }
  }
}
