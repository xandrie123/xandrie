/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamesyap;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JamesYap {

    /**
     * @param args the command line arguments
     */
   
         public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        double w, y;
        int x;

        System.out.println("input any number:");
        w = z.nextDouble();
        System.out.println("Choose a number:\n\n\n[1][2][3]");
        x = z.nextInt();

        switch (x) {
            case 1:
                y = Math.pow(x, 9) - 8 * x + 90;
                System.out.println("The answer is:" + y);
                break;
            case 2:
                y = Math.sqrt(Math.pow(x, 3) + 7) + 2;
                System.out.println("The answer is:" + y);
                break;
            case 3:
                y = ((x*2)+100)/Math.sqrt(x) + 8;
                System.out.println("The answer is:" + y);
                break;
        }
    }
    
}
