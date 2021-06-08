/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author WINDOWS 10
 */
public class Privateclass {
    private int panjang;
    private int lebar;
    private int luas;
    
    public void hitung(int panjang,int lebar){
      this.panjang = panjang; 
      this.lebar = lebar;
    }
    
    public void hasil(){
       luas = panjang * lebar;
       System.out.println("Hasil = " + luas);
    }
    
}
