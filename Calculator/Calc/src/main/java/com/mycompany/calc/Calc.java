
package com.mycompany.calc;
import java.util.Scanner;

public class Calc {
    static double Sum (double n1,double n2){
        System.out.println("The result is :"+(n1+n2));
       return n1+n2; 
    }
    static double Sub (double n1,double n2){
    
        System.out.println("The result is :"+(n1-n2));
    
    return n1-n2;
    }
    static double div (double n1,double n2){
        
            System.out.println("The result is :"+(n1/n2));
    return n1/n2;
    }
    static double mul (double n1,double n2){
    
        System.out.println("The result is :"+(n1*n2));
        
    return n1*n2;
    }
   
    public static void main(String[] args) {
       int i = 0;
        while (i<3){ Scanner in = new Scanner (System.in);
        System.out.println("------------------------ Welcome to calculator App Made by khaled ------------------------");
        System.out.println("Enter the first number :");
        double n1 = in.nextDouble();
        System.out.println("Enter the second number :");
        double n2 = in.nextDouble();
        in.nextLine();
        System.out.println("please select the required operation : +,-,/,*");
        char x = in.nextLine().charAt(0);
        
        switch (x) {
            case '+' :
                Sum (n1,n2);
                break;
            case '-' :
                Sub(n1,n2);
                break;
            case '/' :
                div(n1,n2);
                break;
            case '*' :
                mul(n1,n2);
                break;
        } i++;}
        
    }
}
