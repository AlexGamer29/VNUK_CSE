/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/** @author Hi there */

/*
Bạn có thời gian rảnh và đi làm thêm cho một cửa hàng tạp hóa. Bạn được nhận tiền hoa hồng dựa vào doanh số bán hàng như sau:
- 5% nếu tổng doanh số nhỏ hơn hoặc bằng 100 triệu.
- 10% nếu tổng doanh số nhỏ hơn hoặc bằng 300 triệu.
- 20 % nếu tổng doanh số là lớn hơn 300 triệu.
Viết chương trình nhập vào tổng doanh số bạn bán được và tính số tiền hoa hồng bạn nhận được.
 */
public class Ex10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int todaySales, commissionReceived;
    System.out.println("Nhập vào doanh số bán được: ");
    todaySales = sc.nextInt();

    if (todaySales <= 100000000) {
      commissionReceived = (int) (todaySales * 0.05);
      System.out.printf("Số tiền hoa hồng bạn nhận được: %d VNĐ", commissionReceived);
    } else if (todaySales <= 300000000) {
      commissionReceived = (int) (todaySales * 0.1);
      System.out.printf("Số tiền hoa hồng bạn nhận được: %d VNĐ", commissionReceived);
    } else if (todaySales >= 300000000) {
      commissionReceived = (int) (todaySales * 0.2);
      System.out.printf("Số tiền hoa hồng bạn nhận được: %d VNĐ", commissionReceived);
    }
  }
}
