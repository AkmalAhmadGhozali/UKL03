/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persewaandvd;
public class DVD {
    //Properti Class
    int kode;
    String judul;
    String genre;    //1.Action, 2.Drama, 3.Comedy, 4.Horror
    int tahun;
    String status;   // 1.Tersedia, 2.Dipinjam, 3.Rusak, 4.Hilang
    float hargasewa; 
    
    // Method Set
    void setKode(int kode){
        this.kode = kode;
    }
    void setJudul(String judul){
        this.judul = judul;
    }
    void setGenre(String genre){
        this.genre = genre;
    }
    void setTahun(int tahun){
        this.tahun = tahun;      
    }
    void setStatus(String status){
        this.status = status;
    }
    void setHargaSewa(float hargasewa){
        this.hargasewa = hargasewa;
    }
    
    // Method Get
    int getKode(){
        return this.kode;
    }
    String getJudul(){
        return this.judul;
    }
    String getGenre(){
        return this.genre;
    }
    int getTahun(){
        return this.tahun;
    }
    String getStatus(){
        return this.status;
    }
    float getHargaSewa(){
        return this.hargasewa;
    }
    
    
}
