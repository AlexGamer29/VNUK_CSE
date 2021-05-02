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
// Viết chương trình nhập vào 2 số nguyên và in ra tổng, hiệu và phép nhân 2 số vừa nhập
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num1, num2;
        
        System.out.println("Nhập vào số nguyên thứ nhất: ");
        num1 = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai: ");
        num2 = sc.nextInt();
        
        int tongHaiso = num1 + num2;
        int hieuHaiso = num1 - num2;
        int tichHaiso = num1 * num2; 
        System.out.printf("Tổng 2 số vừa nhập là: %d", tongHaiso);
        System.out.printf("\nHiệu 2 số vừa nhập là: %d", hieuHaiso);
        System.out.printf("\nTích 2 số vừa nhập là: %d", tichHaiso);
    }
}
