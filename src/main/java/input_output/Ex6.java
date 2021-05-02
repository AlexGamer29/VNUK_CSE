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
Nhập vào một số nguyên là bán kính hình tròn. Tính chu vi hình tròn
Cho PI = 3.14
Chu vi = 2 * bán kính * PI
*/
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double PI = 3.14;

        int banKinh;
        System.out.println("Nhập vào bán kính hình tròn: "); //bán kình là số nguyên
        banKinh = sc.nextInt();
        
        float chuVi = (float) (2 * banKinh * PI);
        System.out.printf("Chu vi hình tròn là: %.2f", chuVi);
    }
}
