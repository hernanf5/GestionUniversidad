/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Marco
 */
public class Inscripcion {
    private int idInscripto;
    private double nota;
    private Alumno Alumno;
    private Materia Materia;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripto, double nota, Alumno Alumno, Materia Materia) {
        this.idInscripto = idInscripto;
        this.nota = nota;
        this.Alumno = Alumno;
        this.Materia = Materia;
    }

    public Inscripcion(double nota, Alumno Alumno, Materia Materia) {
        this.nota = nota;
        this.Alumno = Alumno;
        this.Materia = Materia;
    }

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Materia getMateria() {
        return Materia;
    }

    public void setMateria(Materia Materia) {
        this.Materia = Materia;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripto=" + idInscripto + ", nota=" + nota + ", Alumno=" + Alumno + ", Materia=" + Materia + '}';
    }
    
    
    
    
}
