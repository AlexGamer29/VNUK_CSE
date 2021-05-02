/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/**
 *
 * @author Hi there
 */
//Viết chương trình nhập vào 3 số nguyên, tính trung bình cộng 3 số đó
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num1, num2, num3;
        System.out.println("Nhập vào số nguyên thứ nhất: ");
        num1 = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai: ");
        num2 = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ ba: ");
        num3 = sc.nextInt();
        
        int trungbinhCong = (num1 + num2 + num3) / 3;
        System.out.printf("Trung bình cộng của 3 số vừa nhập là: %d", trungbinhCong);
    }
}
