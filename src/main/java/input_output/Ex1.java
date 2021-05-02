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
Nhập vào số  kiểu int và in ra màn hình
Nhập vào số kiểu short và in ra màn hình
Nhập vào số kiểu byte và in ra màn hình
Nhập vào số kiểu long và in ra màn hình
Nhập vào số kiểu float và in ra màn hình
Nhập vào số kiểu double và in ra màn hình
Nhập vào một chuỗi và in ra màn hình (dùng next())
Nhập và in ra họ tên của bạn (dùng nextline())
*/
public class Ex1 {
    public static void main (String[] arg){
       Scanner dataType = new Scanner (System.in);
       
       int iNum;
       System.out.print("Nhap so kieu int: ");
       iNum = dataType.nextInt();
       System.out.println("So kieu int la: " + iNum + "\n");
       
       short sNum;
       System.out.print("Nhap so kieu short: ");
       sNum = dataType.nextShort();
       System.out.println("So kieu short la: " + sNum + "\n");
       
       byte bNumber;
       System.out.print("Nhap so kieu byte: ");
       bNumber = dataType.nextByte();
       System.out.println("So kieu byte la: " + bNumber + "\n");
       
       long lNum;
       System.out.print("Nhap so kieu long: ");
       lNum = dataType.nextLong();
       System.out.println("So kieu long la: " + lNum + "\n");
       
       float fNum;
       System.out.print("Nhap so kieu float: ");
       fNum = dataType.nextFloat();
       System.out.println("So kieu float la: " + fNum + "\n");
       
       double dNum;
       System.out.print("Nhap so kieu double: ");
       dNum = dataType.nextDouble();
       System.out.println("So kieu double la: " + dNum + "\n");
       
       String randomString;
       System.out.print("Nhap chuoi bat ki: ");
       randomString = dataType.next();
       System.out.println("Chuoi ban da nhap vao la: " + randomString + "\n");
       
       String fullName;
       dataType.nextLine();
       System.out.print("Nhap ho va ten cua ban: ");
       fullName = dataType.nextLine();
       System.out.println("Ho va ten cua ban la: " + fullName);
    }
}
