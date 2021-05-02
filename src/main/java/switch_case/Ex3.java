/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_case;

import java.util.Scanner;

/** @author OS */
/*
3.	Viết chương trình in menu và thực hiện chức năng
	-------------------------TINH DIEN TICH--------------------------
	An 1. Dien tich hinh chu nhat
	An 2. Dien tich hinh tam giac
	An 3. Dien tich hinh vuong
	An 4. Dien tich hinh tron
	An 5. Dien tich hinh thang
	Chọn:
Mỗi chức năng nhập các hệ số tương ứng để thực hiện
	Ví dụ: Chọn: 1
	Chieu dai: 3
	Chieu rong: 4
	Dien tich hinh chu nhat la: 12
 */
public class Ex3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float length, width;
    float height, lengthBottom;
    float squareLength;
    float radius;
    float bottomTrapezoid, bottomTrapezoid2;
    int option = 0;
    System.out.println("-------------------------TÍNH DIỆN TÍCH--------------------------");
    System.out.println("Ấn 1. Diện tích hình chữ nhật");
    System.out.println("Ấn 2. Diện tích hình tam giác");
    System.out.println("Ấn 3. Diện tích hình vuông");
    System.out.println("Ấn 4. Diện tích hình tròn");
    System.out.println("Ấn 5. Diện tích hình thang");
    option = sc.nextInt();

    switch (option) {
      case 1:
        {
          System.out.println("Diện tích hình chữ nhật");
          System.out.print("Chiều dài: ");
          length = sc.nextFloat();
          System.out.print("Chiều rộng: ");
          width = sc.nextFloat();
          float formularRectangle = (float) (length * width);
          System.out.printf("Diện tích hình chữ nhật là: %.2f", formularRectangle);
          break;
        }
      case 2:
        {
          System.out.println("Diện tích tam giác");
          System.out.print("Chiều cao: ");
          height = sc.nextFloat();
          System.out.print("Chiều dài cạnh đáy: ");
          lengthBottom = sc.nextFloat();
          float formulaTriangle = (float) (0.5 * height * lengthBottom);
          System.out.printf("Diện tích tam giác là: %.2f", formulaTriangle);
          break;
        }
      case 3:
        {
          System.out.println("Diện tích hình vuông");
          System.out.print("Chiều dài cạnh hình vuông: ");
          squareLength = sc.nextFloat();
          float formulaSquare = (float) (squareLength * squareLength);
          System.out.printf("Diện tích hình vuông là: %.2f", formulaSquare);
          break;
        }
      case 4:
        {
          System.out.println("Diện tích hình tròn");
          System.out.print("Bán kính hình tròn: ");
          radius = sc.nextFloat();
          float formulaCircle = (float) (radius * radius * Math.PI);
          System.out.printf("Diện tích hình tròn là: %.2f", formulaCircle);
          break;
        }
      case 5:
        {
          System.out.println("Diện tích hình thang");
          System.out.print("Chiều dài cạnh đáy thứ nhất: ");
          bottomTrapezoid = sc.nextFloat();
          System.out.print("Chiều dài cạnh đáy thứ hai: ");
          bottomTrapezoid2 = sc.nextFloat();
          System.out.print("Chiều cao: ");
          height = sc.nextFloat();
          float formulaTrapezoid = (float) (0.5 * height * (bottomTrapezoid + bottomTrapezoid2));
          System.out.printf("Diện tích hình thang là: %.2f", formulaTrapezoid);
          break;
        }
    }
  }
}
