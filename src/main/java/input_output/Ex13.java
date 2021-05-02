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
4(x2 + 10x * sqrt root x +3x + 1)
Với x nhập vào từ bàn phím
*/
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        System.out.print("Nhập x: ");
        double x = sc.nextDouble();
        
        double square2 = x * x;
        double squareRoot = Math.sqrt(x);
        double result = 4 * (square2 + 10*x*squareRoot + 3*x + 1);
        
        System.out.printf("Giá trị biểu thức là: %f", result);
    }
}
