/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overall_1;

import java.util.Scanner;

/** @author Hi there */

/*
21.	Nhập số nguyên n. Hãy đếm số lượng chữ số của số nguyên dương n (n > 0)
*/
public class Ex21 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNum = 0, numLength;

    do {
      System.out.println("Nhập số nguyên: "); // nhập số kiểm tra đk
      inputNum = sc.nextInt();
      if (inputNum <= 0) {
        System.out.println("Nhập sai, nhập lại số nguyên > 0 \n");
      }
    } while (inputNum <= 0);

    //	int length = String.valueOf(inputNum).length();
    //    System.out.printf("Số lượng chữ số của số %d là %d", inputNum, length);
    //    int count = 0;
    //    while (inputNum > 10) {
    //      inputNum /= 10;
    //      count++;
    //    }
    //    System.out.println(count);

    int count = 0, length;

    while (inputNum > 0) {
      inputNum = inputNum % 10;
      count++;
    }
    length = count;
    System.out.println(length);
  }
}
