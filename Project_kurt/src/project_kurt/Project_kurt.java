/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_kurt;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Project_kurt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
      
     
          Scanner input=new Scanner(System.in);
          System.out.println("Enter a number");
          
          int a=input.nextInt();
           System.out.println(a);
           
     
         if (a >= 1 && a <= 10){
               System.out.println("plus");
               System.out.println("enter numbers");
               System.out.println("enter number 1:");
               int x = input.nextByte();
               System.out.println("enter number 2:");
               int y = input.nextByte();
               
               int sum= x+y;
               System.out.println("the sum is:"+sum);
               
           } else if (a >= 11 && a <= 20){
               System.out.println("minus");
               System.out.println("enter number");
               System.out.println("enter number 1:");
               int x = input.nextByte();
               System.out.println("enter number 2:");
                
               int y = input.nextByte();
               
               int difference = x-y;
               System.out.println("the difference is:"+difference);
               
               
           }else if (a == 21 || a == 22){
               System.out.println("times");
                System.out.println("enter number ");
                 System.out.println("enter number 1:");
                 int x = input.nextByte();
                  System.out.println("enter number 2:");
                  
                  int y = input.nextByte();
                  
                  int multiplication = x*y;
                   System.out.println("the multiplication is:"+multiplication);
                   
           } else if (a==25){
                System.out.println("divide:");
                System.out.println("enter number ");
                 System.out.println("enter number 1:");
                 int x=input.nextByte();
                  System.out.println("enter number 2:");
                  int y=input.nextByte();
                  
                  int product =x/y;
                   System.out.println("the product is:"+product);
                  
                
                        
                
               
                   
                 
                  
                  
               
               
           }
                       
               
         
                
        
    }
         
               
               
               
           }
      



   

