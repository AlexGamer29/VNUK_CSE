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
Viết chương trình tính biểu thức sau:
4sin(x) + cos(2x + ½)
Với x nhập vào từ bàn phím
*/
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        System.out.print("Nhập x: ");
        double x = sc.nextDouble();
        
        double sin = Math.sin(x);
        double cos = Math.cos(2*x + 0.5);
        double result = 4 * sin + cos;
        
        System.out.printf("Giá trị biểu thức là: %f", result);
    }
}
