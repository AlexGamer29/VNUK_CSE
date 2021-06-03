package Overall_1;

import java.util.Scanner;

public class Ex19 {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean check = true;
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        check = false;
      }
    }
    if (check) {
      System.out.print("SNT");
    } else {
      System.out.print("khong phai SNT");
    }
  }
}
