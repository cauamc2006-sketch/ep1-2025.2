package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InternacaoAtiva {
    private Paciente paciente;
    private LocalDate dataEntrada;
    private String motivo;

    public InternacaoAtiva(Paciente paciente, String motivo){
        this.paciente = paciente;
        this.dataEntrada = LocalDate.now();
        this.motivo = motivo;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public long calcularDiasInternacao(){
        return ChronoUnit.DAYS.between(dataEntrada, LocalDate.now());
    }

    @Override
    public String toString() {
        return paciente.getNome() + " (CPF: " + paciente.getCpf() + ") - Motivo: " + motivo + 
               " - Tempo: " + calcularDiasInternacao() + " dias.";
    }
}
