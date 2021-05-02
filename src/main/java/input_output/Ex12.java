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
Viết chương trình nhập vào năm sinh. In ra số tuổi
Ví dụ nhập 2000
Ban sinh nam 2000, nam nay ban 18 tuoi
*/
public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập năm sinh của bạn: ");
        int birthYear = sc.nextInt();
        
        final int currentYear = 2021;
        int tinhTuoi = currentYear - birthYear;
        System.out.printf("Năm nay bạn %d tuổi", tinhTuoi);
    }
}
