/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xandrie;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Xandrie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int square;
            System.out.println("Enter a number");

            int a = input.nextInt();
            square = a * a;
            System.out.println(square);

            if (square >= 36 && square <= 199) {
                System.out.println("The number belongs between 36 and 199! \n enter  number: \n");
                int x = input.nextInt();

                int cube = x * x * x;

                int difference = square - cube;
                
                System.out.println(difference + "the difference is:" + difference);

            }
            else{
                System.out.println("the number if squared will not belong between 36 and 199");
            }
    
    
}
}
