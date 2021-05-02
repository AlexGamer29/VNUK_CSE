/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if_else;

import java.util.Scanner;

/** @author Hi there */

/*
Nhà bạn hàng tháng phải đóng tiền điện và được tính như sau:
Từ 0 - 50 kwh				đơn giá 1 480 vnđ/kwh
Từ 51 kwh trở đi đến 100 kwh 		đơn giá 1 500 vnđ/kwh
Từ 101 kwh trở đi đến 200 kwh 		đơn giá 1 700 vnđ/kwh
Từ 201 kwh trở lên		 		đơn giá 2 800 vnđ/kwh
Viết chương trình nhập vào tổng số kwh điện đã dùng và tính số tiền phải trả?
*/
public class Ex11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int powerUsed, totalBill;
    System.out.println("Nhập vào tổng số kWh điện đã dùng: ");
    powerUsed = sc.nextInt();

    if (powerUsed < 50 && powerUsed > 0) {
      totalBill = powerUsed * 1480;
      System.out.printf("Số tiền phải trả cho %d kWh điện là: %d VNĐ", powerUsed, totalBill);
    } else if (powerUsed < 100 && powerUsed > 51) {
      totalBill = powerUsed * 1500;
      System.out.printf("Số tiền phải trả cho %d kWh điện là: %d VNĐ", powerUsed, totalBill);
    } else if (powerUsed < 200 && powerUsed > 101) {
      totalBill = powerUsed * 1700;
      System.out.printf("Số tiền phải trả cho %d kWh điện là: %d VNĐ", powerUsed, totalBill);
    } else {
      totalBill = powerUsed * 2800;
      System.out.printf("Số tiền phải trả cho %d kWh điện là: %d VNĐ", powerUsed, totalBill);
    }
  }
}
