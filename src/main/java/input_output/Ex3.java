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
Viết chương trình nhập vào một chuỗi và in ra chuỗi vừa nhập
	Ví dụ: Nhập: Xin chào, Tôi tên là Trần Văn Nam!
		Chuỗi vừa nhập: Xin chào, Tôi tên là Trần Văn Nam!
*/
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr;
        
        System.out.print("Mời bạn nhập vào một chuỗi: ");
        inputStr = sc.nextLine();
        System.out.println("Chuỗi bạn vừa nhập là: " + inputStr);
    }
}
