
package modeloDAO;

import modeloConnetion.ConexaoBD;
import ModeloBeans.ModeloBeansAnimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DAOAnimal {
     ConexaoBD conex =new ConexaoBD();
    ModeloBeans.ModeloBeansAnimal mod = new ModeloBeansAnimal();
    private Object conn;
    
    public void Salvar(ModeloBeansAnimal mod) throws ClassNotFoundException, SQLException {
        
        conex.Conexao();
        try { 
            
            PreparedStatement pst =conex.conn.prepareStatement ("insert into animais values(?,?,?,?,?,?) ");
            
            pst.setInt(1,mod.getCodigo());
            pst.setString(2, mod.getNome());
            pst.setInt(3,mod.getData_nascimento());
            pst.setString(4, mod.getTemperamento());
            pst.setInt(5,mod.getPeso());
            pst.setString(6, mod.getRaca());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com Sucesso!");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Inserir Dados!\nErro: "+ex);
        }
        
        conex.desconecta();
    }
    
    
}
