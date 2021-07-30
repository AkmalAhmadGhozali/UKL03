/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl03;

/**
 *
 * @author WINDOWS 10
 */
public class LatihanUKL03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int sukupertama = 10;
        int selisih = 5;
        int updatenilai;
        int totalnilai = 0;
        
        System.out.println("====== Deret Aritmatika ======");
        
        for(int i = 0; i < 3; i++){
            
            for(int a =0; a <5 ; a++){
                 
                  updatenilai = sukupertama; 
                  sukupertama += selisih;
                
                System.out.print(" " + updatenilai);
                
                totalnilai += updatenilai;
            }                
                System.out.println("");
            }
        System.out.println("Total penjumlahan nilai deret aritmatika : " + totalnilai);
        
    }
    
}
    
    

