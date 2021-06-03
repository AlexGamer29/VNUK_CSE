/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author Hi there
 */
public class ExceptionDemo {
    
    static int inputInt() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            String str = sc.nextLine();
            try {
                n = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.print("Please enter a number: ");
            }
        }
        return n;
    }
    
    public static void main(String[] args) {
        
        //nhap string -> convert string > Int
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("n = ");
//        while (true) {
//            String str = sc.nextLine();
//            try {
//                n = Integer.parseInt(str);
//                break;
//            } catch (Exception e) {
//                System.out.print("Please enter a number: ");
//            }
//        }
        n = inputInt();
        
        System.out.println("n = " + n);
    }
}
