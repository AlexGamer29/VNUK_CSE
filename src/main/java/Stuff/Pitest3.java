package Stuff;

import java.math.BigDecimal;

public class Pitest3 {

    public static void main(String[] args) {

        BigDecimal pi = new BigDecimal("3");
        long l = 1l;
        long max = 100000; // How often, the more, the more exact
        BigDecimal axbxc;
        BigDecimal divide1;
        BigDecimal divide2;
        BigDecimal divide3;
        divide1 = new BigDecimal("2");
        divide2 = new BigDecimal("3");
        divide3 = new BigDecimal("4");
        BigDecimal four = new BigDecimal("4");
        BigDecimal sumthing1;
        BigDecimal sumthing2;
        BigDecimal two = new BigDecimal("2");
        BigDecimal sumthing3;
        BigDecimal sumthing4;

        while (l < max) {

            sumthing1 = divide1.multiply(divide2);
            axbxc = sumthing1.multiply(divide3);

            sumthing2 = four.divide(axbxc, 100, BigDecimal.ROUND_HALF_UP);

            pi = pi.add(sumthing2);

            divide1 = divide1.add(two);
            divide2 = divide2.add(two);
            divide3 = divide3.add(two);

            sumthing3 = divide1.multiply(divide2);
            axbxc = sumthing3.multiply(divide3);

            sumthing4 = four.divide(axbxc, 100, BigDecimal.ROUND_HALF_UP);

            pi = pi.subtract(sumthing4);

            divide1 = divide1.add(two);
            divide2 = divide2.add(two);
            divide3 = divide3.add(two);

            System.out.println(pi.toString() + "            " + l + " of " + max);

            l++;

        }

        System.out.println(pi.toString() + "   finished!");
    }
}
