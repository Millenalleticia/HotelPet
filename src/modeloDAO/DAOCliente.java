
package modeloDAO;

import modeloConnetion.ConexaoBD;
import ModeloBeans.ModeloBeansCliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DAOCliente {
    ConexaoBD conex =new ConexaoBD();
    ModeloBeans.ModeloBeansCliente mod = new ModeloBeansCliente();
    private Object conn;
    
    public void Salvar(ModeloBeansCliente mod) throws ClassNotFoundException {
        
        conex.Conexao();
        try { 
            
            PreparedStatement pst =conex.conn.prepareStatement ("insert into clientes values(?,?,?,?,?) ");
            
            pst.setInt(1,mod.getCodigo());
            pst.setString(2, mod.getNome());
            pst.setInt(3,mod.getCpf());
            pst.setString(4, mod.getEndereco());
            pst.setInt(5, mod.getTelefone());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com Sucesso!");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Inserir Dados!\nErro: "+ex);
        }
        
        conex.desconecta();
    }
    
}
