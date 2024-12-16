
package pryanimales;

/**
 *
 * @author edison
 */
public class Mamifero extends Animal {
      private String tipoPelaje;
    
public Mamifero(String Nombre, int edad, String TipoPelaje){
        super(Nombre, edad);
        this.tipoPelaje = TipoPelaje;
    }
    public void amamantarCrias(){
        System.out.println("El "+Nombre+" esta amamantando sus crias");
    }
}
