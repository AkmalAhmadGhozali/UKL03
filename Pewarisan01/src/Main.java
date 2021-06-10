/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
        
        HewanBertelur telur = new HewanBertelur();
        Ayam unggas = new Ayam();   
        Buaya reptil = new Buaya();
        
        System.out.println("Ayam berjenis tulang  : "+unggas.tulang);
        telur.bertulang();
        
        System.out.println("Buaya bernafas dengan : "+reptil.nafas);
        telur.bernafas();
        
        unggas.berjalan();
        reptil.berjalan();
    }
    
}
