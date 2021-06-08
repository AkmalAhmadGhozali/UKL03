
package perbankan;

/**
 *
 * @author AkmalGhoz
 */
public class Tabungan {
    private final String Norek;
    private final String NamaPemilik;
    private double Saldo;
    
    private double HitungBunga(){
        return this.Saldo * 0.15; 
    }
    
    public Tabungan(String Norek, String NamaPemilik, double Saldo) {
	this.Norek = Norek;  
        this.NamaPemilik = NamaPemilik;  
	this.Saldo = Saldo;        
    }
    
    public void CekSaldo(){
	System.out.println("Saldo tabungan Anda Rp. " + this.Saldo);
    }
    
    public void SimpanUang(double Jumlah) {
        this.Saldo += Jumlah;
        System.out.println("Saldo bertambah Rp. " + this.Saldo);
	System.out.println("Saldo akhir Rp. " + this.Saldo);
    }
    
    public void AmbilUang(double Jumlah) {
        this.Saldo -= Jumlah;
        System.out.println("Saldo berkurang Rp. " + this.Saldo);
	System.out.println("Saldo akhir Rp. " + this.Saldo);
    }
    
    public void PenyesuaianSaldo(){
        System.out.println("Saldo awal Rp. " + this.Saldo);
        System.out.println("Saldo bertambah Rp. " + HitungBunga());
        this.Saldo += HitungBunga();
 	System.out.println("Saldo akhir Rp. " + this.Saldo);
    }
}
