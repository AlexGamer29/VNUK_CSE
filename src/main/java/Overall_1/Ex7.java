package Overall_1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------TINH DIEN TICH--------------------------");
        System.out.println("An 1. Dien tich hinh chu nhat");
        System.out.println("An 2. Dien tich hinh tam giac");
        System.out.println("An 3. Dien tich hinh vuong");
        System.out.println("An 4. Dien tich hinh tron");
        System.out.println("An 5. Dien tich hinh thang");
        System.out.println("An 0. Thoat");
        System.out.print("Chọn:");
        int inp = -1,n;
        do
        {
            n = sc.nextInt();
            inp = n;
            if (inp != 0)
            {
                if (inp == 1) System.out.println("Dien tich hinh chu nhat");
                if (inp == 2) System.out.println("Dien tich hinh tam giac");
                if (inp == 3) System.out.println("Dien tich hinh vuong");
                if (inp == 4) System.out.println("Dien tich hinh tron");
                if (inp == 5) System.out.println("Dien tich hinh thang");
            }
            else break;
        }while (inp != 0);
    }
}
