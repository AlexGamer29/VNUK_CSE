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
public class WrapperDemo {
    public static void main(String[] args) {
        String str = "1234";
 
        
        int num = Integer.parseInt(str);
        float numf = Float.parseFloat("123.5");
        
        Float numF = Float.valueOf("123.5");
        int num1 = numF.intValue();
        
        System.out.println("Int: " + num);   
        System.out.println("Int: " + num1); 

        System.out.println("Float: " + numf);
        
        Integer a = 10;
        int b = a;
        
        Character ch = 'a';
        
        System.out.println("isLetter: " + Character.isLetter(ch));  
        System.out.println("isDigit: " + Character.isDigit(ch));    
        System.out.println("isUpperCase: " + Character.isUpperCase(ch));  
        System.out.println("toUpperCase: " + Character.toUpperCase(ch));
        
        char []chArray = {'H', 'E', 'L', 'o'};
        String str1 = new String(chArray);
        String classes = "Java DS & CES";
        int count = 34;
        
        String format = String.format("Class: %s, Number: %d", classes, count);
        System.out.println(format);

        //length
        int len = classes.length();
        char ch2 = classes.charAt(2); //v
        
        //concat
        String strConcat = classes.concat(" ABC");
        
        System.out.println(classes);
        System.out.println("Len: " + len);
        System.out.println("charAt(2): " + ch2);
        System.out.println("Concat: " + strConcat);
        
        //ABCE
        //ABFB
        System.out.println("CompareTo: " + "ABCE".compareTo("ABFB"));   
        System.out.println("CompareTo: " + "ABCE".compareTo("ABCE"));
        
        int index = classes.indexOf('a');
        System.out.println("Find a: " + index);
        
        int indexL = classes.lastIndexOf('a');
        System.out.println("Find Last a: " + indexL);
        
        //replace
        String replaceStr = classes.replace("DS", "2021 ABC");
        System.out.println(replaceStr);
        
        String subStr = classes.substring(1, 4);
        System.out.println("SubString: " + subStr);
        
        System.out.println("Trim: " + "    ABC    ".trim());

    }
    
}





