
package AccesoADatos;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernán Funes
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost:3306/registro";
    private static final String usuario="root";
    private static final String password="";
    private static Connection con;

    public Conexion() {
    }

    public static Connection getCon() {
        
        if(con == null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                con = DriverManager.getConnection(URL, usuario, password);
            }catch(SQLException ex){
                int error=ex.getErrorCode();
                if(error==1146){
                    JOptionPane.showMessageDialog(null,"Tabla inexistente");
                }else if(error==1062){

                    JOptionPane.showMessageDialog(null,"Dni duplicado");
                }else if(error==1049){

                    JOptionPane.showMessageDialog(null,"BD inexistente");
                }else {

                    JOptionPane.showMessageDialog(null,"Error SQL");

                }
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null,"Error al cargar Driver" + ex.getMessage());
            }
        }
        return con;
    }

    
    
    
}
