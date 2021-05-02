/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Overall_1;

/** @author Hi there */
/*
6.	Viết chương trình in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 5, 7, 93
*/
public class Ex6 {
    public static void main(String arg[])
    {
        //Scanner sc = new Scanner(System.in);
        int n = 100;
        for (int i = 1; i <= n; i++)
            switch (i)
            {
            case 5,7,93:
                continue;
            default:
                    if (i % 2 != 0)
                    System.out.print(i+" ");
            }
    }
}
