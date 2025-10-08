package entities;
import java.time.LocalDateTime;

public class AgendamentoConsulta {
  
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime datahora;
    private Quarto local;
    private String status;
    private double valorFinal;

    public AgendamentoConsulta(Paciente paciente, Medico medico, LocalDateTime datahora, Quarto local, String status){
        this.paciente = paciente;
        this.medico = medico;
        this.datahora = datahora;
        this.local = local;
        this.status = "Agendada";
        this.valorFinal = medico.getCustoConsulta();
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

    public Quarto getLocal(){
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

    public double getValorFinal(){
        return valorFinal;
    }

    public void exibiragendamento(){
        System.out.println("Nome do paciente: " +  paciente.getNome());
        System.out.println("Nome do medico: " + medico.getNome());
        System.out.println("Data e hora: " + datahora);
        System.out.println("Consultório: " + local.getNumero());
        System.out.println("Status: " + status);
        System.out.println("Custo final: R$" + valorFinal + "0");
    }

    public void aplicarDescontoEspecial(){
        if (paciente.temPlanoSaude() && paciente.getIdade() >= 60) {
            double desconto = 0.30;
            this.valorFinal = this.valorFinal * (1 - desconto);
            System.out.println("Desconto aplicado! Novo valor: R$ " + this.valorFinal);}
            else if (paciente.temPlanoSaude()){
                double desconto = 0.15;
                this.valorFinal = this.valorFinal * (1 - desconto);
                System.out.println("Desconto aplicado! Novo valor: R$ " + this.valorFinal);
            }
        }
    }

