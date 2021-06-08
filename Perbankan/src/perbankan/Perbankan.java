
package perbankan;
/**
 *
 * @author AkmalGhoz
 */
public class Perbankan {
    public static void main(String[] args) {
        Tabungan TabunganKu = new Tabungan("00604205", "Akmal Ahmad Ghozali", 250000);
        
        System.out.println("---------[Saldo Awal]----------");
        TabunganKu.CekSaldo();
        System.out.println("---------[Simpan Uang]---------");
        TabunganKu.SimpanUang(150000);
        System.out.println("---------[Ambil Uang]----------");
        TabunganKu.AmbilUang(50000);
        System.out.println("---------[Penyesuaian Saldo]---------");
        TabunganKu.PenyesuaianSaldo();
   }
}
