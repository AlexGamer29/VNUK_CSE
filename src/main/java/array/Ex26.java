// 26.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Tạo mảng b chỉ chứa số nguyên tố từ mảng a

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex26 {

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

    static int countPrimeNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static int[] migratePrimeNumberInAtoB(int[] arr) {
        int countPrime = countPrimeNumber(arr);
        int[] newArr = new int[countPrime];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
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

        System.out.print("\nMảng A vừa nhập");
        outputArray(arr);

        int[] newArray = migratePrimeNumberInAtoB(arr);
        System.out.print("\nMảng B chỉ chứa số nguyên tố từ mảng A là: ");
        outputArray(newArray);
    }
}
