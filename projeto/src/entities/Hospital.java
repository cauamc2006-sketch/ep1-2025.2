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
        
    }

    public void CadastrarMedico(Medico medico){
        this.medicos.add(medico);
        
    }

    public void getPacientesCadastrados(){
        for(Paciente ac: pacientes){
          
            System.out.println( ac.getNome());
        }
            
    }
    public void CadastrarConsulta(AgendamentoConsulta ag){
        consultas.add(ag);
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

    public Paciente findPacienteByIdentifier(String identificador) {
    
    try {
        int idBuscado = Integer.parseInt(identificador); 

       
        for (Paciente p : pacientes) {
            if (p.getId() == idBuscado) { 
                return p; 
            }
        }
    } catch (NumberFormatException e) {
        
    }

    
    for (Paciente p : pacientes) {
        if (p.getNome().equalsIgnoreCase(identificador)) {
            return p; 
        }
    }

    
    return null;
}

public Medico findMedicoByIdentifier(String identificador) {
    
    try {
        int idBuscado = Integer.parseInt(identificador);
        for (Medico m : medicos) {
            if (m.getId() == idBuscado) {
                return m; 
            }
        }
    } catch (NumberFormatException e) {
        
    }

   
    for (Medico m : medicos) {
        if (m.getNome().equalsIgnoreCase(identificador)) {
            return m; 
        }
    }

    
    return null;
}

    



    

    
}