/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import entidades.Inscripcion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 * 
 */

public class InscripcionData {

    private Connection con = null;

    public InscripcionData() {
        this.con = Conexion.getCon();
    }

public void guardarInscripcion(Inscripcion insc){
    String sql ="INSERT INTO inscripcion(idAlumno,idMateria,nota)VALUES (?,?,?) ";
    
    try {
    PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
    ps.setInt(1,insc.getAlumno().getIdAlumno());
    ps.setInt(2,insc.getMateria().getIdMateria());
    ps.setDouble(3,insc.getNota());
    ps.executeUpdate();
    
    ResultSet rs= ps.getGeneratedKeys();
    if(rs.next()) {
        insc.setIdInscripto(rs.getInt(1));
        JOptionPane.showMessageDialog(null, "Inscripcion Registrada");
    }
   
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"ERROR");
    }
}    

}
