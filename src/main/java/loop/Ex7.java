/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loop;

import java.util.Scanner;

/** @author Hi there */
/*
7.	Tạo bảng số như dưới
0	1	2	3	4	5	6	7	8	9
10	11	12	13	14	15	16	17	18	19
…
90	91	92	93	94	95	96	97	98	99
*/
public class Ex7 {

  public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
	
	for (int i = 0; i <= 99; i++) {
      System.out.print(i + "\t");
	    if (i % 10 == 9) {
        System.out.print("\n");
		}
	}
  }
}
