
package pryanimales;

/**
 *
 * @author edison
 */
public class Animal {
    public String Nombre;
    public int edad;

    public Animal(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }
    public void comer(){
        System.out.println(Nombre+" esta comiendo");
    }
    public void edad(){
        System.out.println(Nombre+" tiene : "+edad+" years ");
    }
    public void dormir(){
        System.out.println("El "+Nombre+" esta durmiendo");
    }
}
