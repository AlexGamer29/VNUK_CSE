/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

/**
 *
 * @author Hi there
 */
/*
Viết chương trình in ra màn hình thông tin của bạn có cấu trúc như sau
	------------------------------------------------------------------------
			Tran Van Tuan
			Age 20
			120 Phan Chau Trinh, Da Nang
	------------------------------------------------------------------------
*/
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-15s %-5s","","Tran Van Tuan");
        System.out.printf("\n%-15s %-5s","","Age 20");
        System.out.printf("\n%-15s %-5s","","120 Phan Chau Trinh, Da Nang");
        System.out.println("\n------------------------------------------------------------------------");
    }
}
