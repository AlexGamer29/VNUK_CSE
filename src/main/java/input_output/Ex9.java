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
/*
Nhập vào 2 số nguyên là 2 cạnh của hình chữ nhật. Tính diện tích hình chữ nhật.
Diện tích = chiều dài * chiều rộng
*/
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int chieuDai, chieuRong;
        System.out.println("Nhập vào chiều dài của hình chữ nhật: ");
        chieuDai = sc.nextInt();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
        chieuRong = sc.nextInt();
        
        int chuViHcn = chieuDai * chieuRong;
        System.out.printf("Diện tích hình chữ nhật là: %d", chuViHcn);
    }
}
