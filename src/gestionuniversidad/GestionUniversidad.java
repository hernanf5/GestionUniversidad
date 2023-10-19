package gestionuniversidad;
import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.time.LocalDate;
import java.time.Month;


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

        Conexion.getCon();
        AlumnoData alumno = new AlumnoData();
        MateriaData materia = new MateriaData();
        InscripcionData inscripcion = new InscripcionData();

//        alumno.guardarAlumno(new Alumno ("Funes","Hernan",123489,LocalDate.of(2000, 5, 10),true));
//        System.out.println(alumno.buscarAlumno(4));
//        System.out.println(alumno.buscarAlumnoPorDni(43764888));
//        System.out.println(alumno.listarAlumnos());

////        alumno.modificarAlumnos(new Alumno (5,"Diaz", "Jorge",123456789,LocalDate.of(1999,8, 19),true));

//        alumno.eliminarAlumno(5);

        materia.guardarMateria(new Materia("Ingles", 2, true));
        System.out.println(materia.buscarMateria(1));
        materia.modificarMateria(new Materia(5, "Algebra", 0, true));
        materia.eliminarMateria(3);
        System.out.println(materia.listarMaterias());

        inscripcion.guardarInscripcion(new Inscripcion(8.6 , new Alumno("Hofman", "Laura",147258,LocalDate.of(1998,8, 19),true), new Materia("Ingles", 2, true)));
        //System.out.println(inscripcion.obtenerInscripciones());
        System.out.println(inscripcion.obtenerInscripcionesPorAlumno(2));
        System.out.println(inscripcion.obtenerMateriasCursadas(2));
        System.out.println(inscripcion.obtenerMateriasNOCursadas(2));
        inscripcion.actualizarNota(2, 5, 5.5);
        System.out.println(inscripcion.obtenerAlumnosXMateria(5));
        inscripcion.borrarInscripcionMateriaAlumno(2, 5);

        System.out.println(alumno.listarAlumnos());
        
    }

}

