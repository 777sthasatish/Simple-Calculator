/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda;

import java.util.Date;

/**
 *
 * @author Satish
 */
public class DataConverting {

    public static void main(String[] args) {
        //implicit conversion
        int i = 100;
        double d = i;
        System.out.println(d);
        System.out.println(i);

        //explicit conversion
        double myDouble = 128D;
        Double doubleObj = new Double(myDouble);
        byte byteValue = doubleObj.byteValue();
        System.out.println(myDouble);
        System.out.println(byteValue);

        //postfix and prefix
        int a = 10;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);

        //comparing Strings
        String s1 = "Hello1";
        String s2 = "Hello";
        if (s1 == s2) {
            System.out.println("They match");

        } else {
            System.out.println("They do not match");
        }

        //Character examples
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        char dollar = '\u0024';
        System.out.print(dollar);
        System.out.print(c1);
        System.out.print(c2);
        System.out.println(c3);
        
        char a1='a';
        char a2='b';
        char a3='c';
        
        System.out.println(Character.toUpperCase(a1));
        System.out.println(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));
        
        //boolean examples
        
        String s="False";
        boolean b=Boolean.parseBoolean(s);
        System.out.println(b);
        
        int x=1;
        boolean y=(a!=2);
        System.out.println(!y);
        
        //converting to String
        Date myDate =new Date();
        System.out.println(myDate.toString());
        
        String str1="1";
        String str2="2";
        
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        
    }
}
