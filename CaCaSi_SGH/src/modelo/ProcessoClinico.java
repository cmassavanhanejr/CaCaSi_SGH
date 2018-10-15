package modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
@Entity
@Table(name="ProcessoClinico")
public class ProcessoClinico {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String observacaoClinica;

	private String prescricoesTerapeuticas;

        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dataEmissao;
        
        
        @OneToOne
	private Paciente paciente;

	@ManyToOne
        private MarcTratamento marcTratamento;

        @ManyToOne
	private Medico medico;

        @ManyToOne
	private MarcConsulta marcConsulta;

        @ManyToOne
	private MarcExame examePaciente;

	public ProcessoClinico() {

	}

    public String getObservacaoClinica() {
        return observacaoClinica;
    }

    public void setObservacaoClinica(String observacaoClinica) {
        this.observacaoClinica = observacaoClinica;
    }

    public String getPrescricoesTerapeuticas() {
        return prescricoesTerapeuticas;
    }

    public void setPrescricoesTerapeuticas(String prescricoesTerapeuticas) {
        this.prescricoesTerapeuticas = prescricoesTerapeuticas;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public MarcTratamento getMarcTratamento() {
        return marcTratamento;
    }

    public void setMarcTratamento(MarcTratamento marcTratamento) {
        this.marcTratamento = marcTratamento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public MarcConsulta getMarcConsulta() {
        return marcConsulta;
    }

    public void setMarcConsulta(MarcConsulta marcConsulta) {
        this.marcConsulta = marcConsulta;
    }

    public MarcExame getExamePaciente() {
        return examePaciente;
    }

    public void setExamePaciente(MarcExame examePaciente) {
        this.examePaciente = examePaciente;
    }
        
        

}
