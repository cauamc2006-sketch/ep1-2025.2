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
    // 1️⃣ Tenta converter o texto digitado em número
    try {
        int idBuscado = Integer.parseInt(identificador); // se o texto for "3", vira número 3

        // 2️⃣ Procura paciente com esse ID
        for (Paciente p : pacientes) {
            if (p.getId() == idBuscado) { // compara o ID do paciente
                return p; // achou o paciente, retorna ele
            }
        }
    } catch (NumberFormatException e) {
        // 3️⃣ Se não for número (por exemplo, o texto for "Maria"), ele vem parar aqui
    }

    // 4️⃣ Se chegou aqui, tenta procurar pelo nome (ignora maiúsculas/minúsculas)
    for (Paciente p : pacientes) {
        if (p.getNome().equalsIgnoreCase(identificador)) {
            return p; // achou o paciente pelo nome
        }
    }

    // 5️⃣ Se não encontrou de jeito nenhum
    return null;
}

public Medico findMedicoByIdentifier(String identificador) {
    // 1️⃣ Tenta converter o texto em número (ID)
    try {
        int idBuscado = Integer.parseInt(identificador);
        for (Medico m : medicos) {
            if (m.getId() == idBuscado) {
                return m; // Achou pelo ID
            }
        }
    } catch (NumberFormatException e) {
        // 2️⃣ Se não for número, ignora e busca por nome
    }

    // 3️⃣ Busca pelo nome (sem diferenciar maiúsculas/minúsculas)
    for (Medico m : medicos) {
        if (m.getNome().equalsIgnoreCase(identificador)) {
            return m; // Achou pelo nome
        }
    }

    // 4️⃣ Se não achou de jeito nenhum
    return null;
}

    



    

    
}