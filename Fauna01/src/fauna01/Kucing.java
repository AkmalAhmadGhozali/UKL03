
package fauna01;
/**
 *
 * @author WINDOWS 10
 */
  public class Kucing extends Hewan {
    @Override
    public void display(){
    System.out.println("Ini adalah kucing");
  }

  public void printMessage(){
    display();
  }
}
