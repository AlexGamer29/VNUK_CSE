/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author Hi there
 */
/*
Viết chương trình nhập vào một số nguyên là năm (ví dụ năm nay 2018). Kiểm tra số vừa nhập có phải là năm nhuận hay không? 
Biết rằng năm nhuận là:
Năm chia hết cho 4 nhưng không chia hết cho 100.
Hoặc năm chia hết cho 400.
 */
public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leapYear;
        System.out.print("Nhập năm bạn muốn kiểm tra có nhuận hay không: ");
        leapYear = sc.nextInt();

        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 100 == 0) {
            System.out.printf("Năm %d là năm nhuận", leapYear);
        } else {
            System.out.printf("Năm %d không là năm nhuận", leapYear);
        }
    }
}
