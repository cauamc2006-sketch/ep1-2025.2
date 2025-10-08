package entities;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<AgendamentoConsulta> consultas;

    public Hospital(){
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void CadastrarPaciente(Paciente paciente){
        this.pacientes.add(paciente);
        System.out.println("Paciente " + paciente.getNome() + " cadastrado.");
    }

    public void CadastrarMedico(Medico medico){
        this.medicos.add(medico);
        System.out.println("Médico(a): " + medico.getNome() + " cadastrado");
    }

    public void getPacientesCadastrados(){
        for(Paciente ac: pacientes){
          
            System.out.println( ac.getNome());
        }
            
    }

    public void PacientesCadastrados(Hospital cadastrosPaciente){
        System.out.println("Pacientes Cadastrados: ");
        getPacientesCadastrados();
        System.out.println("-------------");
    }

    public void getMedicosCadastrados(){
        for(Medico ac: medicos){
            System.out.println(ac.getNome());
        }
    }
    
    public void MedicosCadastrados(Hospital cadastrosMedicos){
        System.out.println("Médicos cadastrados:");
        getMedicosCadastrados();
        System.out.println("-------------");
    }
}
