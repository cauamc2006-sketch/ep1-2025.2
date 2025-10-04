import entities.Paciente;
import entities.Medico;
import java.time.LocalDateTime;

public class AgendamentoConsulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime datahora;
    private String local;
    private String status;

    public AgendamentoConsulta(Paciente paciente, Medico medico, LocalDateTime datahora, String local, String status){
        this.paciente = paciente;
        this.medico = medico;
        this.datahora = datahora;
        this.local = local;
        this.status = "Agendada";
    }
    
    public Paciente getPaciente(){
        return paciente;
    }
    
    public Medico getMedico(){
        return medico;
    }

    public LocalDateTime getDatahora(){
        return datahora;
    }

    public String getLocal(){
        return local;
    }

    public String getStatus(){
        return status;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public void setMedico(Medico medico){
        this.medico = medico;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
