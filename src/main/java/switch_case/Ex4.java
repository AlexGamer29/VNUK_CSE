/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switch_case;

import java.util.Scanner;

/** @author Hi there */
/*
4.	Nhập tháng và năm. In ra màn hình tháng đó có bao nhiêu ngày. 
Ví dụ:
Nhập 3 Thang 3 co 31 ngay
Nhap 13 Khong co thang 13
Ghi chú: cách xác định năm nhuận: năm chia hết cho 4 và không chia hết cho 100, hoặc chia hết cho 400. 
*/
public class Ex4 {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int month, year;
    System.out.print("Nhập tháng: ");
	month = sc.nextInt();
    System.out.print("Nhập năm: ");
	year = sc.nextInt();
	
	switch (month) {
	  case 1, 3, 5, 7, 8, 10, 12:
		System.out.printf("Tháng %d có 31 ngày", month);
		break;
	  case 4, 6, 9, 11:
		System.out.printf("Tháng %d có 30 ngày", month);
		break;
	  case 2:
		if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) { 
            System.out.printf("Năm %d là năm nhuận", year);
        } else {
            System.out.printf("Năm %d không là năm nhuận", year);
		} // Năm chia hết cho 4 và không chia hết cho 100, hoặc chia hết cho 400
		break;
	  case 13:
		System.out.println("Không có tháng 13");
		break;
	}
  }
}
