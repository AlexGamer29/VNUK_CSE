package Overall_1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,n;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("------PHEP TINH---------");
        System.out.println("An 1. a x b");
        System.out.println("An 2. a / b");
        System.out.println("An 3. a + b");
        System.out.println("An 4. a - b");
        System.out.println("An 5. a % b");
        System.out.println("An 0. Thoat");
        System.out.print("Chọn: ");
        n = sc.nextInt();
        if (n == 1) System.out.println(a * b);
        if (n == 2) System.out.println(a / b);
        if (n == 3) System.out.println(a + b);
        if (n == 4) System.out.println(a - b);
        if (n == 5) System.out.println(a % b);
        if (n == 0) System.out.println("Thoat");
    }
}
