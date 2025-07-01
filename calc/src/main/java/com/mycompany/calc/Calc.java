
package com.mycompany.calc;
import java.util.Scanner;
public class Calc {
    static double sum (double n1,double n2){
        System.out.println(n1+n2);
        
        return n1+n2; 
    }
    static double sub (double n1,double n2){
        System.out.println(n1-n2);
        return n1-n2;
    }
    static double mul (double n1, double n2){
          System.out.println(n1*n2);
        return n1*n2;    
    }
    static double div (double n1 ,double n2){
        System.out.println(n1/n2);
        return n1/n2;
    
    }

    public static void main(String[] args) {
      int y =0;
        while (y<3) {  Scanner in = new Scanner (System.in);
        System.out.println("------------------------ Welcome To calc app made by khaled ------------------------");
        System.out.println("Enter your first number :");
        double n1 = in.nextDouble();
        System.out.println("Enter your second number");
        double n2 = in.nextDouble();
        in.nextLine(); // دوره يشيل السطر اللي اتعمل بعد ما عملت انتر اللي هو دا \n // store \n 
        System.out.println("Please select the required operation : +,-,/,* ");
         char x = in.nextLine().charAt(0);
         
        switch (x) {
            case '+' :
                sum(n1,n2);
                break;
            case '-' :
                sub(n1,n2);
                break;
            case '*' :
                mul(n1,n2);
                break;
            case '/' :
                div(n1,n2);
                break;
            
        }
        y++; }
    }
}
