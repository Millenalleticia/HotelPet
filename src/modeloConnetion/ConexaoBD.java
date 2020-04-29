
package modeloConnetion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ConexaoBD {
    
    
    public Statement stm;
    public ResultSet rs; 
    private String driver = "com.mysql.jdbc.Driver " ; 
    private String caminho = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC" ;   
    private String usuario= "root" ;   
    private String senha = "abelneto" ;  
    public Connection conn;
   
    
    
    
   public void Conexao() throws ClassNotFoundException {
       
               
       try {
             
             System.setProperty("jdbc.Drivers", driver);
            conn=DriverManager.getConnection(caminho, usuario, senha);
            
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se Conectar ao Banco de Dados:\n"+ex.getMessage());
        }
 }
   public void executaSql(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs=stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro executa sql:\n"+ex.getMessage());
        }
       
       
       
       
       
   }
   
   
   
   
   public void desconecta(){
       
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Bando de Dados Desconectado com Sucesso");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Fechar Conexão com Banco de Dados:\n"+ex.getMessage());
        }
   }    

   
    }
             
   

