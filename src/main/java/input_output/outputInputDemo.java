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
public class outputInputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Toi ten la: Nguyen Van A");
        System.out.println("Tuoi: 18");
        
        String name = "Nguyen Huu Minh Duc";
        int age = 28;
        float height = 1.7f;
        System.out.println("Toi ten la: " + name + ". Tuoi: " + age);
        System.out.printf("Toi ten la: %s. Tuoi: %d. Chieu cao: %.1f m", name, age, height);
        
        
        
        System.out.printf("\n%-5s %-15s %-5s", "ID", "Name", "Age");
        System.out.printf("\n%-5s %-15s %-5d", "001", "Ngo Anh", 21);
        System.out.printf("\n%-5s %-15s %-5d", "001", "Hoang Van Anh", 23);
    }
}
