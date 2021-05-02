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
Viết chương trình nhập vào một số kiểu số nguyên. In ra kết quả số đó là số dương hay số âm
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iNum;
        System.out.println("Nhập vào một số nguyên: ");
        iNum = sc.nextInt();

        if (iNum > 0) {
            System.out.printf("Số %d là số dương", iNum);
        } else {
            System.out.printf("Số %d là số âm", iNum);
        }
    }
}
