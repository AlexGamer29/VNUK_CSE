// 19.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Xóa tất cả các số âm trong mảng

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex19 {

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

    static int countNegativeElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }

    static int[] removeNegativeNumbers(int[] arr) {
        int countNegative = countNegativeElements(arr);
        int[] newArr = new int[arr.length - countNegative];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
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

        int[] newArray = removeNegativeNumbers(arr);
        System.out.print("\nMảng sau khi xóa tất cả số âm: ");
        outputArray(newArray);

    }
}
