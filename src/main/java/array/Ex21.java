// 21.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex21 {

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

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static int removeDuplicates(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return len;
        }
        // mảng tmp để lưu phần tử không lặp lại
        int[] tmp = new int[arr.length];
        int j = 0;
  
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                tmp[j++] = arr[i];
            }
        }
        tmp[j++] = arr[arr.length - 1];
  
        // Trỏ mảng tmp cho mảng arr
        for (int i = 0; i < j; i++) {
            arr[i] = tmp[i];
        }
  
        return j;
    }

    static void outputUpdatedArray(int[] arr, int j) {
        for (int i = 0; i < j; i++) {
            System.out.printf("\narr[%d] = %d", i, arr[i]);
        }
        System.out.println();
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

        bubbleSort(arr);
        int index = removeDuplicates(arr);
        System.out.print("\nMảng sau khi xóa tất cả các phần tử trùng nhau: ");
        outputUpdatedArray(arr, index);
    }
}
