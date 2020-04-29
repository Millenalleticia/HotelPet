
package ModeloBeans;

import java.util.Date;



public class ModeloBeansAgenda {
    private int agendaCod;
    private String nome;
    private String turno;
    private String data;
    private String Servicos_oferecidos;

    /**
     * @return the agendaCod
     */
    public int getAgendaCod() {
        return agendaCod;
    }

    /**
     * @param agendaCod the agendaCod to set
     */
    public void setAgendaCod(int agendaCod) {
        this.agendaCod = agendaCod;
    }

    /**
     * @return the nome_animal
     */
    public String getNome() {
        return nome;
    }

    /**
    
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the Servicos_oferecidos
     */
    public String getServicos_oferecidos() {
        return Servicos_oferecidos;
    }

    /**
     * @param Servicos_oferecidos the Servicos_oferecidos to set
     */
    public void setServicos_oferecidos(String Servicos_oferecidos) {
        this.Servicos_oferecidos = Servicos_oferecidos;
    }

    public void setIntData(Date date) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
