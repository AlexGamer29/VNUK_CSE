// 15.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Sắp xếp số nguyên tố tăng dần nhưng giá trị khác giữ nguyên vị trí

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex15 {
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

    static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void bubbleSort(int[] arr) {
        int tmp;
        // Duyệt từ đầu đến gần cuối
        for (int i = 0; i < arr.length - 1; i++) {
            // Tại vị trí bất kì, kiểm tra tất cả phần tử sau nó
            for (int j = i + 1; j < arr.length; j++) {
                // Kiểm tra 2 số nguyên tố
                // Tăng dần thì trường hợp số sau nhỏ hơn số trước
                if (isPrimeNumber(arr[i]) && isPrimeNumber(arr[j]) && arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

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
        System.out.print("\nMảng tăng dần vừa sắp xếp: ");
        outputArray(arr);
    }
}
