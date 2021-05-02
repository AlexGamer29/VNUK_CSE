package Overall_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {
    public static void main(String arg[])
    {
        int dem = 0;
        int[] divi = new int[10000];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = Math.sqrt(a);
        int l = (int) b;
        for (int i = 1; i <= l; i++)
            if (a % i == 0)
                if (i != a/i)
                {
                    dem++;
                    divi[dem] = i;
                    dem++;
                    divi[dem] = a/i;
                }
                else
                {
                    dem++;
                    divi[dem] = i;
                }
        Arrays.sort(divi,1,dem+1);
        int pro = 1 ;
        //for (int i = 1; i <= dem; i++) pro *= divi[i];
        //System.out.print(dem);
        for (int i = 1; i <= dem; i++) 
            if (divi[i] % 2 != 0)    
                pro *= divi[i];
        System.out.print(pro+" ");
    }
}
