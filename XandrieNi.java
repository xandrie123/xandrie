/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xandrie.ni;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class XandrieNi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Scanner input=new Scanner(System.in);
          System.out.println("Enter a number");
          
          int a=input.nextInt();
           System.out.println(square);
        
        
        
       if (sqaure >=36 && <=199){
            System.out.println("enter  number:");
            System.out.println("enter  number 1:");
            int x = input.nextByte();
            System.out.println("enter  number 2:");
            int y = input.nextByte();
            
            int cube = x*x*x;
            
            int difference = sqaure-cube;
              System.out.println(difference+"the difference is:"+ difference);
            
            
        }
            
    }
    
}
