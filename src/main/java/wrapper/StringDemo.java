/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;

/**
 *
 * @author mac
 */
public class StringDemo {
    public static void main(String[] args) {
        String str =  "   nGuyen       van      nA    ";
        
        //NGUYEN VAN AN
        //Nguyen Van An
        
        String newStr = str.trim();
        
        
        //2 dau space gan nhau, du 1 cai -> tim 2 dau space, xoa 1 space
        while(newStr.indexOf("  ") != -1) {
            newStr = newStr.replace("  ", " ");
        }
        
        //NGUYEN VAN AN
        //System.out.println(newStr.toUpperCase());
        
        //nGuyen van nA -> Nguyen Van An
        //chatAt
        String format = "";
        for (int i = 0; i < newStr.length(); i++) {
            char ch = newStr.charAt(i);
            
            if (i == 0) {
                if (Character.isLowerCase(ch)) {
                    format += Character.toUpperCase(ch);
                } else {
                    format += ch;
                }
            } else {
                char beforeCh = newStr.charAt(i - 1);
                if (Character.isSpaceChar(beforeCh) && Character.isLetter(ch)) {
                    if (Character.isLowerCase(ch)) {
                        format += Character.toUpperCase(ch);
                    } else {
                        format += ch;
                    }
                } else {
                    if (Character.isLowerCase(ch)) {
                        format += ch;
                    } else {
                        format += Character.toLowerCase(ch);
                    }
                }
            }
        }
        System.out.println(format);
        
    }
    
}
