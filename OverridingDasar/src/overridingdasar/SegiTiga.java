
package overridingdasar;
/**
 *
 * @author WINDOWS 10
 */
public class SegiTiga extends BangunDatar {
   int alas;
   int tinggi;

    public SegiTiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
   @Override
   public float luas(){
       return this.alas * this.tinggi;
   }

    
}
