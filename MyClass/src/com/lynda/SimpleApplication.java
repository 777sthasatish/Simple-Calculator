/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda;

import java.math.BigDecimal;

/**
 *
 * @author Satish
 */
public class SimpleApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double myDouble=10010.42343;
        Double conDouble=new Double(myDouble);
        int i=conDouble.intValue();
        float f=conDouble.floatValue();
        byte b=conDouble.byteValue();
        short s=conDouble.shortValue();
        long l=conDouble.longValue();
        
        int j=101;
        Integer conInt=new Integer(j);
        String str=conInt.toString();
        System.out.println(myDouble);
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(str);
   
        
        
        BigDecimal payment=new BigDecimal(1115.37);
        System.out.println(payment.toString());
    }
}
    
 
