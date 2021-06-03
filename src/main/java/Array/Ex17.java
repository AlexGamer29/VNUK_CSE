// 17.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Thêm 1 phần tử x vào mảng tại vị trí k

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex17 {
    
    static int[] inputArray(int inputNum) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[inputNum];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\narr[%d] = %d", i, arr[i]);
        }
        System.out.println();
    }

    static int[] insertElement(int[] arr, int element, int position) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }
        newArray[position] = element;

        for (int i = position; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int inputNum;
        int[] arr;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào n: ");
            inputNum = sc.nextInt();
            if (inputNum <= 0) {
                System.out.println("\nVui lòng nhập vào n > 0");
            }
        } while (inputNum <= 0);

        arr = inputArray(inputNum);

        System.out.print("\nMảng vừa nhập");
        outputArray(arr);

        int x, k;
        System.out.print("\nNhập vào phần tử x: ");
        x = sc.nextInt();
        do {
            System.out.print("Nhập vào vị trí k: ");
            k = sc.nextInt();
            if (k < 0 || k >= arr.length) {
                System.out.printf("Vui lòng nhập vị trí [0, %d): ", arr.length);
            }
        } while (k < 0 || k >= arr.length);

        int[] newArray = insertElement(arr, x, k);
        System.out.print("\nMảng sau khi chèn phần tử: ");
        outputArray(newArray);
    }
}
