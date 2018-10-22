package modelo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Medico extends Funcionario {
        
        @ManyToOne
	private Especialidade especialidade;

	

	public Medico() {

	}

 

  

    /**
     * @return the especialidade
     */
    public Especialidade getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }       
}
