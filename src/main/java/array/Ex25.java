// 25.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Tạo mảng b chỉ chứa giá trị lẻ từ mảng a

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex25 {
    
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


    static int countOddNumbers(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    static int[] migrateOddNumberInAtoB(int[] arr) {
        int countOdd = countOddNumbers(arr);
        int[] newArr = new int[countOdd];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
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
        
        int[] newArray = migrateOddNumberInAtoB(arr);
        System.out.print("\nMảng B chỉ chứa giá trị lẻ từ mảng A là: ");
        outputArray(newArray);
    }
}
