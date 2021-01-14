/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pola1;

/**
 *
 * @author WINDOWS 10
 */
public class Pola1 {
    public static void main(String[] args) {
        int i,j;
        for (i=1 ; i<= 4 ; i++){
            if(i==1 || i==4){
                for(j=1 ; j<=4 ; j++){
                    System.out.print("@");
                }
                System.out.println("");
            }
            else{
                System.out.print("@");
                for (j=1 ; j<=2; j++){
                    System.out.print(" ");
                }
                System.out.println("@");
                
            }
        }       
        
    }    
}
