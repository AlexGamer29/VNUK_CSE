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
Nhập vào một số thập phân là bán kính hình tròn. Tính diện tích hình tròn.
Cho PI = 3.14
Diện tích = PI * bán kính * bán kính
*/
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double PI = 3.14;

        float banKinh;
        System.out.println("Nhập vào bán kính hình tròn: "); //bán kình là số thập phân
        banKinh = sc.nextFloat();
        
        float dienTich = (float) (banKinh * banKinh * PI);
        System.out.printf("Diện tích hình tròn là: %.2f", dienTich);
    }
}
