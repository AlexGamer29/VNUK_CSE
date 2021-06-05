/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Hi there
 */
public class ArrayDemo1D_Methodv2 {
    
    static int[] inputArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("[%d] = ", i);
            array[i] = sc.nextInt();
        }
        return array;
    }
    
    static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    
    static boolean isPerfectNumber(int n) {
        int s = 0;
        for (int i = 1; i <= n /2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        
        return s == n;
    }
    
    static void listPerfectNumber(int[] array) {
        int count = 0;
        System.out.print("Perfect numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (isPerfectNumber(array[i])) {
                System.out.print(array[i] + "\t");
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("none");
        }
    }
    
    //Tim so lon nhat trong mang 1 chieu
    static int findMax(int []array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    
    //Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Sắp xếp mảng tăng dần
    //Bubble sort
    static void sort(int []array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    
    //Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Thêm 1 phần tử x vào mảng tại vị trí k (>= 0 < len)
//    3 4 5 1
//    x = 10
//    k = 2
//    3 4 10 5 1 
    static int[] insertElement(int[] a, int element, int at) {
        int []newA = new int[a.length + 1];
        for (int i = 0; i < at; i++) {
            newA[i] = a[i];
        }
        newA[at] = element;
        
        for(int i = at; i < a.length; i++) {
            newA[i + 1] = a[i];
        }
        return newA;
    }
    
    
    public static void main(String[] args) {
        //n > 0
        
        int n;
        int[] array; //khai bao
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("n = ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.print("Please input number > 0: ");
            }
        } while(n <= 0);
        
        System.out.println("Input array");
        array = inputArray(n);
        
        System.out.print("Output: ");
        printArray(array);
        
        System.out.println();
        listPerfectNumber(array);
        
        System.out.println("\nMax: " + findMax(array));
        
        sort(array);
        System.out.print("Sort: ");
        printArray(array);
        
        
        System.out.println();
        int x, k;
        System.out.print("Insert element x = ");
        x = sc.nextInt();
        do {
            System.out.print("At k = ");
            k = sc.nextInt();
            if (k < 0 || k >= array.length) {
                System.out.printf("Please input number [0, %d): ", array.length);
            }
        } while(k < 0 || k >= array.length);
        
        int []newArray = insertElement(array, x, k);
        System.out.print("\nNew Array: ");
        printArray(newArray);
    }
    
}

