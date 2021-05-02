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
// Viết một chương trình nhập 3 số nguyên và tìm giá trị lớn nhất
public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iNum_1, iNum_2, iNum_3;
        System.out.println("Nhập vào số thứ nhất: ");
        iNum_1 = sc.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        iNum_2 = sc.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        iNum_3 = sc.nextInt();

        if (iNum_1 > iNum_2 && iNum_1 > iNum_3) {
            System.out.printf("%d là số lớn nhất", iNum_1);
        } 
        else if (iNum_2 > iNum_1 && iNum_2 > iNum_3) {
            System.out.printf("%d là số lớn nhất", iNum_2);
        } 
        else {
            System.out.printf("%d là số lớn nhất", iNum_3);
        }
    }
}
