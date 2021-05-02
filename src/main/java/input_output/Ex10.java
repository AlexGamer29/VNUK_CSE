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
Nhập vào thông tin của một học sinh bao gồm: họ và tên, tuổi, địa chỉ, lớp, điểm toán, điểm lý, điểm hóa. Sau đó in ra màn hình thông tin vừa nhập và điểm trung bình các môn học:
	Điểm trung bình = (toán + lý + hóa)/3
*/
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double diemToan, diemLy, diemHoa, diemTrungBinh;
        String name, tuoi, diaChi, lop;
        
        System.out.print("Nhập họ và tên của bạn: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        tuoi = sc.next();
        
        sc.nextLine();
        System.out.print("Địa chỉ của bạn ở đâu? : ");
        diaChi = sc.nextLine();
        
        System.out.print("Bạn học lớp mấy: ");
        lop = sc.next();
        
        System.out.print("Nhập điểm Toán của bạn: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhập điểm Lý của bạn: ");
        diemLy = sc.nextDouble();
        System.out.print("Nhập điểm Hóa của bạn: ");
        diemHoa = sc.nextDouble();
        
        diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
        System.out.printf("\nHọ và tên là: %s", name);
        System.out.printf("\nTuổi: %s", tuoi);
        System.out.printf("\nĐịa chỉ của bạn: %s", diaChi);
        System.out.printf("\nLớp: %s", lop);
        System.out.printf("\nĐiểm Toán: %f", diemToan);
        System.out.printf("\nĐiểm Lý: %f", diemLy);
        System.out.printf("\nĐiểm trung bình: %f", diemTrungBinh);
        
    }
}
