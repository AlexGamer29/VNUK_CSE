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
public class inputDemo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        String name;
        String address;
        int age;
        
        System.out.print("Name: ");
        name = sc.nextLine();
        
        System.out.print("Age: ");
        age = sc.nextInt();
        
        sc.nextLine(); // Remove Enter key above
        System.out.print("Address: ");
        address = sc.nextLine();
        
        System.out.println(name + "\n" + age + "\n" + address);
        
        
        
    }
}
