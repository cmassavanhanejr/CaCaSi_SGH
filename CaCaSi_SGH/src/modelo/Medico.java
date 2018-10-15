package modelo;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table (name="Medico")
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
