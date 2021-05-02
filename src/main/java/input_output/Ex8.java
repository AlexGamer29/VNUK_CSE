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
Nhập vào 2 số thập phân là 2 cạnh của hình chữ nhật. Tính chu vi hình chữ nhật.
Chu vi  = (chiều dài + chiều rộng) * 2
*/
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double chieuDai, chieuRong;
        System.out.println("Nhập vào chiều dài của hình chữ nhật: ");
        chieuDai = sc.nextDouble();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
        chieuRong = sc.nextDouble();
        
        double chuViHcn = (chieuDai + chieuRong) * 2;
        System.out.printf("Chu vi hình chữ nhật là: %f", chuViHcn);
    }
}
