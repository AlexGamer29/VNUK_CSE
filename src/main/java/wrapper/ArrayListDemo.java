/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author mac
 */
public class ArrayListDemo {
    
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        
        names.add("Nguyen Van A"); 
        names.add("Nguyen Van B");
        
        
        for (int i = 0; i < names.size(); i++) {
            String name = (String)names.get(i);
            System.out.print(name + " ");
        }
        
        System.out.println();
        ArrayList<Integer> iList = new ArrayList();
        iList.add(1);
        iList.add(3);
        iList.add(4);
        
        for (int value : iList) {
            System.out.print(value + " ");
        }
        
        iList.add(1, 2); // 1, 2, 3 ,4
        iList.set(2, 5); //1, 2, 5, 4
        iList.remove(3); //1, 2, 5
        System.out.println();
        for (int value : iList) {
            System.out.print(value + " ");
        }
        
        ArrayList<Integer> iList1 = new ArrayList();
        iList1.add(10);
        iList1.add(30);
        iList1.add(40);
        
        System.out.println();
        iList.addAll(0, iList1); //10, 30 40, 1, 2 ,5
        for (int value : iList) {
            System.out.print(value + " ");
        }
        
        //increasing sorting
        Collections.sort(iList);
        System.out.println();
        for (int value : iList) {
            System.out.print(value + " ");
        }
        
        Comparator<Integer> compare = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*
                if (o1 < o2) {
                    return 1;
                } else if (o1 > o2) {
                    return -1;
                } else {
                    return 0;
                }*/
                return o2 - o1;
            }
        };
        Collections.sort(iList, compare);
        
        System.out.println();
        for (int value : iList) {
            System.out.print(value + " ");
        }
    }
    
}

//compareTo -1 0 1
