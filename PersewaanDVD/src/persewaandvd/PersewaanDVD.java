/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persewaandvd;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class PersewaanDVD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DVD dataDVD = new DVD();
        
        
        //----------------------------------------------//
        System.out.println("====== Selamat Datang di Cinema Disc ======");
        System.out.println("= Tempat Mewujudkan Bioskop di Rumah Anda =");
        System.out.println("                                  ");
        System.out.println("Silahkan Masukkan Pilihan Anda :) ");
        System.out.println("                                  ");

        
        System.out.print("Kode DVD     : ");
        dataDVD.setKode(input.nextInt());
        
        System.out.print("Judul DVD    : ");
        dataDVD.setJudul(input.next());
        
        System.out.print("Genre DVD    : ");
        dataDVD.setGenre(input.next());
        
        System.out.print("Tahun DVD    : ");
        dataDVD.setTahun(input.nextInt());
        
        System.out.print("Status DVD   : ");
        dataDVD.setStatus(input.next());
        
        System.out.print("Harga DVD    : ");
        dataDVD.setHargaSewa(input.nextFloat());
        
        //----------------------------------------------//
        System.out.println("========================================");
        System.out.println("Kode DVD       : " + dataDVD.getKode());
        System.out.println("Judul DVD      : " + dataDVD.getJudul());
        System.out.println("Genre DVD      : " + dataDVD.getGenre());
        System.out.println("Tahun DVD      : " + dataDVD.getTahun());
        System.out.println("Status DVD     : " + dataDVD.getStatus());
        System.out.println("Harga Sewa DVD : " + dataDVD.getHargaSewa());
                         
    }
    
}
