
package mascoapp;

import java.util.Scanner;
import mascoapp.entidades.Mascota;
import mascoapp.servicios.ServicioMascota;




public class MascoAPP {

    public static void main(String[] args) {
       
      ServicioMascota sm= new ServicioMascota();
      
       
      Mascota m1= sm.crearMascota();
       
      System.out.println(m1.toString());
    }
        
    
}
