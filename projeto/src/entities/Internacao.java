package entities;
import java.time.LocalDateTime;


public class Internacao {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private Quarto quarto;
    private double custo; 
    boolean ativa;
    
    public Internacao(Paciente paciente, Medico medico, LocalDateTime dataEntrada, LocalDateTime dataSaida, Quarto quarto, double custo){
        this.paciente = paciente;
        this.medico = medico;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.custo = custo;
        this.ativa = true;

    }

    public void finalizar(LocalDateTime saida, double custoTotal){
        this.dataSaida = saida;
        this.custo = custoTotal;
        this.ativa = false;
    }

    public void Cancelar(){
        this.ativa = false;
    }

    public Quarto getQuarto(){
        return quarto;
    }

    public boolean isAtiva(){
        return ativa;
    }
     public Paciente getPaciente(){
        return paciente;
    }
    
    public Medico getMedicoResponsavel(){
        return medico;
    }

    public LocalDateTime getdataEntrada(){
        return dataEntrada;
    }

    public LocalDateTime getdataSaida(){
        return dataSaida;
    }

    public double getCustoInternacao(){
        return custo;
    }

    
        
}
