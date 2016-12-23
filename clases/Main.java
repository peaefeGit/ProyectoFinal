package clases;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import ventanas.NewJFrameLogin;
import oracle.jrockit.jfr.JFR;
import sun.rmi.runtime.Log;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        
        MySQL db = new MySQL(); 
        db.MySQLConnection("root", "", "/proyecto_colibri");       
        
        
        NewJFrameLogin ventana = new NewJFrameLogin(db);
        ventana.show();
        
        
        
        /*ArrayList<String> prods = db.getAll("productos");
        
        System.out.println(prods);
        //Producto p;
        //db.getProductoById(p, 1);
        //p.toString();
        
        //db.closeConnection();
           */ 
    }

}
