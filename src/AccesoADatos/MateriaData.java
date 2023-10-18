
package AccesoADatos;

import entidades.Materia;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernán Funes
 */
public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
        con = Conexion.getCon();
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?,?,?)";
        try{
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito ");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar la materia " + ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ? AND estado = 1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la materia");
            }
            ps.close(); //preguntar
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia"+ ex);
        }
        
        return materia;
    }
    
    public void modificarMateria(Materia materia){
        PreparedStatement ps = null;
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            int exito = ps.executeUpdate();
            
            if(exito ==1){
                JOptionPane.showMessageDialog(null, "Modificado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex);
        }
        
    }
    
    public void eliminarMateria(int id){
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int exito = ps.executeUpdate();
            
            if(exito ==1){
                JOptionPane.showMessageDialog(null, "Materia dada de baja con exito ");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro la materia ");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex);
        }
    }
    
    public List<Materia> listarMaterias(){
        
        List<Materia> materias = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM materia WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                
                materias.add(materia);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla materia"+ ex);
        }
        return materias;
    }
    
}
