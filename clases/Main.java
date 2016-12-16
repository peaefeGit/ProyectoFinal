package clases;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import ventanas.NewJFrameLogin;
import oracle.jrockit.jfr.JFR;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        
        MySQL db = new MySQL();

        db.MySQLConnection("root", "", "/proyecto_colibri");       

        db.MySQLConnection("root", "", "/proyecto_colibri");
        //db.getAll("productos");

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
