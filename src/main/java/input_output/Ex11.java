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
Viết chương trình tính giá trị biểu thức sau:
	3x3 - 5x2 + 6x + 5
	Với x được nhập vào từ bàn phím
*/
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        System.out.print("Nhập x: ");
        double x = sc.nextDouble();
        
        double square2 = x * x;
        double square3 = x * x * x;
        System.out.printf("Giá trị biểu thức là: %f", 3*square3 - 5*square2 + 6*x +5 );
    }
}
