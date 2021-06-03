/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
5.	Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số hoàn hảo hay không. 
Số hoàn hảo là số có tổng tất cả các ước bé hơn bé hơn n bằng chính nó. Ví dụ 6 là số hoàn hảo, vì 6 có các ước là 1, 2, 3. Và tổng 1 + 2 +3 = 6
*/

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex5 {

  static int inputNum() {
    int n;
    System.out.println("Nhập vào n: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    return n;
  }

  static boolean isPerfectNumber(int n) {
    int count = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        count += i;
      }
    }

    if (count == n) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    int n = inputNum();

    if (isPerfectNumber(n)) {
      System.out.println(n + " là " + "số hoàn hảo");
    } else {
      System.out.println(n + " không là " + "số hoàn hảo");
    }
  }
}
