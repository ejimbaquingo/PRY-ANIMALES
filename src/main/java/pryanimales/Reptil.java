
package pryanimales;

/**
 *
 * @author edison
 */
public class Reptil extends Animal {
     private String tipoEscamas;
    
    public Reptil(String Nombre, int edad, String tipoEscamas){
        super(Nombre, edad);
        this.tipoEscamas = tipoEscamas;
    }
    public void arrastrase(){
        System.out.println("La "+Nombre+" se esta arrastrando con el tipo de "+tipoEscamas);
    }
}
