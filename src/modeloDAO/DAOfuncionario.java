
package modeloDAO;

import modeloConnetion.ConexaoBD;
import ModeloBeans.ModeloBeansfuncionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DAOfuncionario {
    ConexaoBD conex =new ConexaoBD();
    ModeloBeans.ModeloBeansfuncionario mod = new ModeloBeansfuncionario();
    private Object conn;
    
    public void Salvar(ModeloBeansfuncionario mod) throws ClassNotFoundException {
        
        conex.Conexao();
        try { 
            
            PreparedStatement pst =conex.conn.prepareStatement ("insert into funcionarios values(?,?,?,?) ");
            
            pst.setInt(1,mod.getCodigo());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getFuncao());
            pst.setInt(4, mod.getPis());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com Sucesso!");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Inserir Dados!\nErro: "+ex);
        }
        
        conex.desconecta();
        
    }
    
    
}
