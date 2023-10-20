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

//        Alumno alumnoACargar = new Alumno (5,"Diaz", "Jorge",123456789,LocalDate.of(1999,8, 19),true);
//        alumno.modificarAlumnos(alumnoACargar);

//        alumno.eliminarAlumno(5);
//        Materia materiaACargar = new Materia("Ingles", 2, true);
//        System.out.println(materiaACargar);
//        materia.guardarMateria(materiaACargar);
        
//        System.out.println(materia.buscarMateria(1));
//        materia.modificarMateria(new Materia(5, "Algebra", 0, true));
//        materia.eliminarMateria(3);
//        System.out.println(materia.listarMaterias());
//double nota, Alumno Alumno, Materia Materia
//        inscripcion.guardarInscripcion(new Inscripcion(8.6 , new Alumno(6,"Funes", "Hernan",22222222,LocalDate.of(1995,8, 9),true), new Materia(1, "Matematica", 1, true)));
//        inscripcion.guardarInscripcion(new Inscripcion(8.6 , new Alumno(6,"Funes", "Hernan",22222222,LocalDate.of(1995,8, 9),true), new Materia(2, "Laboratorio", 2, true)));
//  
        //id de alumno
//        System.out.println(inscripcion.obtenerInscripcionesPorAlumno(6));
        //id de alumno
//        System.out.println(inscripcion.obtenerMateriasCursadas(6));

//        System.out.println(inscripcion.obtenerMateriasNOCursadas(6));
//int idAlumno, int idMateria, double nota
//        inscripcion.actualizarNota(6, 1, 5.5);
        //id materia
//        System.out.println(inscripcion.obtenerAlumnosXMateria(1));
//        inscripcion.borrarInscripcionMateriaAlumno(6, 1);
//
//        System.out.println(alumno.listarAlumnos());
//        
    }

}

