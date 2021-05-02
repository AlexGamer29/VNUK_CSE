package Overall_1;

/*
20.	Cho số nguyên dương n. Kiểm tra xem n có phải là số chính phương hay không
*/

import java.util.Scanner;

public class Ex20 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( Math.sqrt(n) == (int) Math.sqrt(n))
            System.out.print("Số chính phương");
        else System.out.print("Không phải số chính phương");
    }
}
