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
Viết chương trình nhập một số nguyên bất kỳ từ bàn phím và in kết quả ra màn hình 
để nói cho người dùng biết số đó là lớn hay nhỏ hơn 100.
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int iNum;
        iNum = sc.nextInt();
        if (iNum < 100 == true) {
            System.out.println("Số nhỏ hơn 100");
        } else {
            System.out.println("Số lớn hơn 100");
        }
    }
}
