
package modeloDAO;

import ModeloBeans.ModeloBeansAgenda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConnetion.ConexaoBD;



public class DAOAgenda {
    
    ConexaoBD conex =new ConexaoBD();
    ModeloBeans.ModeloBeansAgenda mod = new ModeloBeansAgenda();
    private Object conn;
   
    
    
    public void Salvar (ModeloBeansAgenda agenda) throws ClassNotFoundException{
        conex.Conexao();
        try { 
            
            PreparedStatement pst =conex.conn.prepareStatement ("insert into agenda values(?,?,?,?,?) ");
            
            pst.setInt(1,mod.getAgendaCod());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getTurno());
            pst.setString(4,mod.getData());
            pst.setString(5, mod.getServicos_oferecidos());
            
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Agendamento feito com Sucesso!");
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Inserir Dados de Agendamento!\nErro: "+ex);
        }
        
        
         conex.desconecta();
   
}
}
