package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;


public class MySQL {
    private static Connection Conexion;
    
    public void MySQLConnection(String user, String pass, String db_name) throws Exception{
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306" + db_name, user, pass);
        JOptionPane.showMessageDialog(null, "Se ha iniciado la conexion con el servidor de forma existosa.");
        }catch (ClassNotFoundException ex){
           Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);     
        }catch (SQLException ex){
             Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void closeConnection() {
        try {
            Conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha finalizado la conexión con el server");
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
   /* public ArrayList<String> getAll(String table_name){
        ArrayList<String> prods = new ArrayList<String> ();
        try {
            String Query = "SELECT nombre FROM " + table_name;
            Statement stmt = Conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);            
            while (rs.next()) {
                prods.add((rs.getString("nombre")));               
            }
            return prods;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en la adquisicion de datos");
            return null;
        }
        
       
    }*/
    
    /*
    *  Devuelve True si los parametros coinciden con algun valor de la Base de Datos
    */
    public Boolean validarLogin(JPasswordField pass, JTextField user ){
          
        try {
            
            String Query = "SELECT * FROM usuarios";
            boolean ok = false;          
            Statement stmt = Conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);                   
            
            while ((rs.next() && !ok)) {
                if ((rs.getString("usuario").equals(user.getText()) ) && (rs.getString("password").equals(pass.getText()))){
                 
                       ok = true;                     
                }                
            }                      
             return ok;             
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en el Usuario o en la Contraseña"+e);
            return null;
            
        }
       
    }
    /*
    * Llena una lista con los productos cuyo nombre contenga un String que viene por parametro.
    */
    public void buscarPlatos(JList list, String nombre, String categoria){
        DefaultListModel model = new DefaultListModel();
        try {            
            String Query = "SELECT * FROM productos INNER JOIN categorias ON productos.categoria = categorias.idCategoria WHERE categorias.nombre ='"+categoria+"' AND productos.nombre LIKE '"+nombre+ "%'"  ;
            Statement stmt = Conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);            
            while (rs.next()) {
                String itemCode = rs.getString("nombre");
                model.addElement(itemCode);               
            }
             list.setModel(model);        
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en la adquisicion de datos");            
        }        
    }
    
    
    
    /*
    *  Llena una lista con todos los productos de la base de datos.
    */    
    
    public void llenarJlist(JList list){
        DefaultListModel model = new DefaultListModel();
        try {
            String Query = "SELECT * FROM productos";
            Statement stmt = Conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            
            while (rs.next()) {
                String itemCode = rs.getString("nombre");
                model.addElement(itemCode);
                
            }
            list.setModel(model);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error en la adquisicion de datos");

        }
        
    }
    
    public Float getPrecioProd(String nombre) {
        
        try {
            String Query = "SELECT precio FROM productos WHERE nombre='"+nombre+"'";
            Statement stmt = Conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            rs.next();
            Float resultado = rs.getFloat("precio");
            System.out.println(resultado);
            return resultado;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en la adquisicion de datos"+e);
            return null;
        }
    }
    
     public void buscarPorCategoria(JList list, String cadena){
        DefaultListModel model = new DefaultListModel();
        try {            
            String Query = "SELECT * FROM productos INNER JOIN categorias ON productos.categoria = categorias.idCategoria WHERE categorias.nombre ='"+cadena+"'"  ;
            Statement stmt = Conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            
            while (rs.next()) {
                String itemCode = rs.getString("nombre");
                model.addElement(itemCode);               
            }
             list.setModel(model);        
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en la adquisicion de datos");           
        }
        
        
    }
    
    public Producto getProducto(String nombre) {
        try {
            String Query = "SELECT * from productos WHERE nombre = '"+nombre+"'";
            Statement stmt = Conexion.createStatement();
            ResultSet rs = stmt.executeQuery(Query);
            
            rs.next();
            Producto p = new Producto(rs.getInt("idProducto"),
                    rs.getInt("categoria"),
                    rs.getString("nombre"),
                    rs.getFloat("precio"));
            return p;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "algun error"+e);
            return null;
        }
        
    }
    
     public void guardarCuenta(Cuenta c){
       try{  
            Statement stmt = Conexion.createStatement();
            stmt.executeUpdate("INSERT INTO ventas(fecha, monto, descripcion)"+"VALUES ('"+c.getFecha()+"','"+c.getMonto()+"','"+c.getDescripcion()+"')");
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "error en la adquisicion de datos"+e); 
      }      
       
    }
    
     public void guardarMovimiento(Movimiento m){
         try{
             
            Statement stmt = Conexion.createStatement();
            stmt.executeUpdate("INSERT INTO movimientos(monto, responsable, descripcion, fecha, proveedor, tipo)"+"VALUES ('"+m.getMonto()+"','"+m.getResponsable()+"','"+m.getDescripcion()+"','"+m.getFecha()+"','"+m.getProveedor()+"','"+m.getTipo()+"')");
         
         } catch(Exception e) {
          JOptionPane.showMessageDialog(null, "error en la adquisicion de datos"+e); 
         }      
         
     }
}