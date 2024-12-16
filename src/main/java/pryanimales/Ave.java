
package pryanimales;

/**
 *
 * @author edison
 */
public class Ave extends Animal{
     private double envergaduraAlas;
    public Ave(String Nombre, int edad, double envergaduraAlas){
        super(Nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }
    public void envergaduraAlas(){
        System.out.println(Nombre+" esta volando con una envergadura de: "+envergaduraAlas+" metros");
    }
    
}
