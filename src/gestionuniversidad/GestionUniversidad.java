
package gestionuniversidad;

import AccesoADatos.AlumnoData;
import entidades.Alumno;
import java.text.Normalizer;

/**
 *
 * @author Hernán Funes
 */
public class GestionUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
  
    AlumnoData alu= new AlumnoData();
    
    for(Alumno alumnos:alu.listarAlumnos()){
        
            System.out.println(alumnos.getDni());
            System.out.println(alumnos.getApellido());
            System.out.println(alumnos.getNombre());
            System.out.println(alumnos.getFechaNacimiento());
    }
    
    
}
