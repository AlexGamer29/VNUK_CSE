// 8.	Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). 
// Tìm số chẵn cuối cùng trong mảng. Nếu mảng không có giá trị chẵn thì trả về -1

package array;

import java.util.Scanner;

/** @author Hi there */
public class Ex8 {

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

    static int findLastEvenNumber(int[] arr) {
        int tmp = 0;
        int count = 0;
        
        // có thể đếm ngược lại i--
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] % 2 == 0) {
                tmp = arr[i];
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return tmp;
    }

    public static void main(String[] args) {
        int inputNum;
        int[] arr;
        int lastEvenNum;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào n: ");
            inputNum = sc.nextInt();
            if (inputNum <= 0) {
                System.out.println("\nVui lòng nhập vào n > 0");
            }
        } while (inputNum <= 0);

        arr = inputArray(inputNum);

        System.out.print("\nMảng vừa nhập");
        outputArray(arr);

        lastEvenNum = findLastEvenNumber(arr);
        if (lastEvenNum == -1) {
            System.out.println("\nMảng không có giá trị chẵn");
        } else {
            System.out.println("\nSố chẵn cuối cùng trong mảng là: " + lastEvenNum);
        }
    }
}
