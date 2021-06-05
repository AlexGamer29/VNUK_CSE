// 7.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Tìm giá trị lớn nhất trong mảng.

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex7 {

    static int[] inputArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
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

    static int isHighestValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int inputNum;
        int[] arr;
        int max;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào n: ");
            inputNum = sc.nextInt();
            if (inputNum <= 0) {
                System.out.println("\nVui lòng nhập n > 0");
            }
        } while (inputNum <= 0);

        arr = inputArray(inputNum);

        System.out.print("\nMảng vừa nhập");
        outputArray(arr);

        max = isHighestValue(arr);
        System.out.println("\nGiá trị lớn nhất trong mảng là: " + max);
    }
}
