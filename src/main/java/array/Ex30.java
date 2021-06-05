// 30.	Cho mảng một chiều n phần tử, viết hàm tạo ra mảng một chiều n phần tử có các phần tử là từ mảng đã cho và sắp xếp vị trí ngẫu nhiên

package array;

import java.util.Random;
import java.util.Scanner;

public class Ex30 {

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

    static void swap(int[] arr, int i, int randomIndexForSwap) {
        int tmp = arr[randomIndexForSwap];
        arr[randomIndexForSwap] = arr[i];
        arr[i] = tmp;
    }
    
    static int[] shuffleArray(int[] arr) {
        Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int randomIndexForSwap = rand.nextInt(arr.length);
			swap(arr, i, randomIndexForSwap);
		}
        return arr;
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

        
        int[] newArray = shuffleArray(arr);
        System.out.print("\nMảng đã sắp xếp vị trí ngẫu nhiên là: ");
        outputArray(arr);
    }
}
