
package mascoapp.servicios;

import java.util.Scanner;
import mascoapp.entidades.Mascota;

public class ServicioMascota {
    
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
        
        System.out.println("introduzca nombre: ");
        String nombre= leer.next();
        System.out.println("introduzca el apodo: ");
        String apodo= leer.next();
        System.out.println("introduzca tipo: ");
        String tipo= leer.next();
        return new Mascota(nombre, apodo, tipo);
        
        
    }
}
