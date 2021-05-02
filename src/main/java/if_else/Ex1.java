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
Viết chương trình nhập vào một số kiểu số nguyên. In ra kết quả số đó là số chẵn hay số lẻ
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int iNum;
        iNum = sc.nextInt();

        if (iNum % 2 == 0) {
            System.out.printf("Số %d là số chẵn", iNum);
        } else {
            System.out.printf("Số %d là số lẻ", iNum);
        }
    }
}
