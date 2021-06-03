// 16.	Nhập số nguyên n. 
// Viết hàm kiểm tra các chữ số của số nguyên dương n có tăng dần từ trái sang phải hay không

package method;

import java.util.Scanner;

/** @author Hi there */
public class Ex16 {
    
    static int checkCondition() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("\nVui lòng nhập n > 0");
            }
        } while (n <= 0);
        return n;
    }

    static boolean checkIncreasingLtoR(int n) {
        int lastNum = n % 10;
        n /= 10;
        while (n != 0) {
            int separateNumber = n % 10;
            n /= 10;
            if (separateNumber > lastNum) {
                return false;
            } else {
                separateNumber = lastNum;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = checkCondition();

        if (checkIncreasingLtoR(n)) {
            System.out.println(n + " là số tăng dần từ trái sang phải");
        } else {
            System.out.println(n + " không là số tăng dần từ trái sang phải");
        }
    }
}
