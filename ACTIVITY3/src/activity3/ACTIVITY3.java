/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity3;

/**
 *
 * @author user
 */
public class ACTIVITY3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
       int fact= 1;
        int  i= 1;
       
       System.out.println( a);
       
         
         do {
          
             
                a=a+1  ;
               
             
 
             
                
                
       
           
       if (a %2==0) {  System.out.println( a +" (even)");  do {   
                
              fact= fact* i;
 
                 i++;    }
                     while ( i <= a); 
         System.out.println(" The factorial  of the give number " +a +" ! is " + fact);}
             
      
                else  {  System.out.println(a +" (odd)  ");
                
              do {   
                 
              fact= fact* i;
 
                 i++;    }
                     while ( i <= a); 
         System.out.println(" The factorial  of the give number " +a +" ! is " + fact);
        
      
              
     
       
       
       }  
               
   }  while(a <17);  
     
     
      
  
              
          
     
         
         
         

    }
       
         
    
         
         
      
      
        
           
           
           
    }
    
}
