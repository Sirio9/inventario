/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domesab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class Conexion {
     
   public String db ="inventario";
   public String url ="jdbc:mysql://localhost/"+db;
   public String pass = "";
   public String user ="root";
   
   PreparedStatement ps;
   
   
  public Connection conec() throws SQLException{
        Connection link = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");

            link = DriverManager.getConnection(this.url,this.user,this.pass);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
}
       return link;
    }
 
} 

