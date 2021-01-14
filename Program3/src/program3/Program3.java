/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
    public class Program3 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Program menjumlahkan 2 nilai");
        System.out.print("Masukkan nilai a : ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = input.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = input.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));                     
     }
        private static int jumlah(int a,int b){
            int hasil = a + b;
            return hasil;
        }
}
