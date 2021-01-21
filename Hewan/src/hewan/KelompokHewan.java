/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

import java.util.Scanner;

public class KelompokHewan {
    public String Nama, Makanan, Jenis, Gerakan;
    public int JumlahKaki, Tinggi, Berat, JumlahGerakan;
    
    //Constructor atau initialisation
    
    public KelompokHewan(){
        Nama       = null;
        Makanan    = null;
        Jenis      = null;
        Gerakan    = null;
        JumlahGerakan = 0;
        JumlahKaki    = 0;
        Tinggi        = 0;
        Berat         = 0;
    }
    
    public void IsiNilaiProperti(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan   : ");
        Nama = input.nextLine();
        System.out.print("Makanan      : ");
        Makanan = input.nextLine();
        if (Makanan.equalsIgnoreCase("Tumbuhan")){
            Jenis = "Herbivora";
        }if (Makanan.equalsIgnoreCase("Daging")){
            Jenis = "Karnivora";
        }if (Makanan.equalsIgnoreCase("Tumbuhan & Daging")){
            Jenis = "Omnivora";
        }else Jenis = "Bukan Hewan";
        System.out.print("Jumlah Kaki   :  ");
        JumlahKaki = input.nextInt();
        System.out.print("Tinggi Badan  :  ");
        Tinggi = input.nextInt();
        System.out.print("Berat Badan   :  ");
        Berat = input.nextInt();
        
    }
    public void CetakNilaiProoerti(){
        System.out.println("----------------------------");
        System.out.println("Nama Hewan   : " + Nama);
        System.out.println("Makanan      : " + Makanan);
        System.out.println("Jenis Hewan  : " + Jenis);
        System.out.println("Jumlah Kaki  : " + JumlahKaki);
        System.out.println("Tinggi Badan : " + Tinggi);
        System.out.println("Berat Badan  : " + Berat);
    }
    
    public void Bergerak(){
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("----------------------------");
        System.out.print("Jenis Gerakan   : ");
        Gerakan = input.nextLine();
        System.out.print("Jumlah Gerakan  : ");
        JumlahGerakan = input.nextInt();
        for (i=1; i <= JumlahGerakan; i++){
            System.out.println(Gerakan);
        }
    }
}
