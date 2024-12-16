
package pryanimales;
import java.util.Scanner;
/**
 *
 * @author edison
 */
public class PryAnimales {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

       
        System.out.println("Ingrese el nombre del mamifero:");
        String nombreMamifero = scanner.nextLine();
        System.out.println("Ingrese la edad del mamifero (en years):");
        int edadMamifero = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese el tipo de pelaje del mamifero:");
        String tipoPelaje = scanner.nextLine();

        Mamifero mam = new Mamifero(nombreMamifero, edadMamifero, tipoPelaje);
        mam.comer();
        mam.amamantarCrias();
        mam.edad();

        System.out.println("\nIngrese el nombre del ave:");
        String nombreAve = scanner.nextLine();
        System.out.println("Ingrese la edad del ave (en years):");
        int edadAve = scanner.nextInt();
        System.out.println("Ingrese la envergadura de las alas (en metros):");
        double envergadura = scanner.nextDouble();
        scanner.nextLine(); 

        Ave ave = new Ave(nombreAve, edadAve, envergadura);
        ave.comer();
        ave.envergaduraAlas();
        ave.edad();

        System.out.println("\nIngrese el nombre del reptil:");
        String nombreReptil = scanner.nextLine();
        System.out.println("Ingrese la edad del reptil (en years):");
        int edadReptil = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Ingrese el tipo de escamas del reptil:");
        String tipoEscamas = scanner.nextLine();

        Reptil reptil = new Reptil(nombreReptil, edadReptil, tipoEscamas);
        reptil.comer();
        reptil.arrastrase();
        reptil.edad();
        
        scanner.close();
    }
}
