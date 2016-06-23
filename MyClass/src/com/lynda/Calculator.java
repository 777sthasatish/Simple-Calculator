/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynda;

import java.util.Scanner;

/**
 *
 * @author Satish
 */
public class Calculator {

    public static void main(String[] args) {
        int choice, a, b, c;
        String choose="";
        
        
        while (true) {
            System.out.println("============================");
            System.out.println("Simple Calculator");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Exit");
            System.out.println("============================");
            System.out.println("Enter your Choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            while (true) {
                switch (choice) {
                    case 1:
                        while (true) {                            
                            System.out.println("Addition");
                            System.out.println("Enter first number:");
                            a = sc.nextInt();
                            System.out.println("Enter second number");
                            b = sc.nextInt();
                            c = a + b;
                            System.out.println("The sum of two number is:" + c);
                            System.out.println("Do you want to add more(Yes/No):");
                            choose=sc.next();
                            if(choose.equalsIgnoreCase("Yes"))
                            {
                                continue;
                            }
                            else
                            {
                                break;
                            }
                           
                        }
                    break;
                    case 2:
                        while(true)
                        {
                        System.out.println("Subtraction");
                        System.out.println("Enter first number:");
                        a = sc.nextInt();
                        System.out.println("Enter second number");
                        b = sc.nextInt();
                        c = a - b;
                        System.out.println("The difference between two number is:" + c);
                         System.out.println("Do you want to subtract more(Yes/No):");
                            choose=sc.next();
                            if(choose.equalsIgnoreCase("Yes"))
                            {
                                continue;
                            }
                            else
                            {
                                break;
                            }
                           
                        }
                    break;                        

                    case 3:
                        while(true)
                        {
                        System.out.println("Multiplication");
                        System.out.println("Enter first number:");
                        a = sc.nextInt();
                        System.out.println("Enter second number");
                        b = sc.nextInt();
                        c = a * b;
                        System.out.println("The multiplication of two number is:" + c);
                         System.out.println("Do you want to multiply more(Yes/No):");
                            choose=sc.next();
                            if(choose.equalsIgnoreCase("Yes"))
                            {
                                continue;
                            }
                            else
                            {
                                break;
                            }
                        }
                        break;

                    case 4:
                        while(true)
                        {
                        System.out.println("Division");
                        System.out.println("Enter first number:");
                        a = sc.nextInt();
                        System.out.println("Enter second number");
                        b = sc.nextInt();
                        c = a / b;
                        System.out.println("The division of two number is:" + c);
                       System.out.println("Do you want to divide more(Yes/No):");
                            choose=sc.next();
                            if(choose.equalsIgnoreCase("Yes"))
                            {
                                continue;
                            }
                            else
                            {
                                break;
                            }
                        }
                     break;
                        
                    case 5:
                        System.exit(0);
                }
                break;
            }
        }
    }

}
