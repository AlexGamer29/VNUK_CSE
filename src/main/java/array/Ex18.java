// 18.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Hãy xóa tất cả số lớn nhất trong mảng các số thực

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex18 {
    
    static float[] inputArray(int inputNum) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[inputNum];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextFloat();
        }
        return arr;
    }

    static void outputArray(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\narr[%d] = %f", i, arr[i]);
        }
        System.out.println();
    }

    static float isHighestValue(float[] arr) {
        float max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int countMaxElements(float[] arr, float x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                count++;
            }
        }
        return count;
    }

    static float[] removeMaxElements(float[] arr) {
        float max = isHighestValue(arr);
        int countMax = countMaxElements(arr, max);

        float[] newArr = new float[arr.length - countMax];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int inputNum;
        float[] arr;

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

        float[] newArray = removeMaxElements(arr);
        System.out.print("\nMảng số thực sau khi xóa tất cả số lớn nhất: ");
        outputArray(newArray);
        System.exit(0);
    }
}
