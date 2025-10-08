package entities;
import java.io.ObjectInputFilter.Status;
import java.time.LocalDateTime;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
   

        Paciente p1 = new Paciente("Cauã Mendes", "05418394", 19, false);
        Paciente p2 = new Paciente("Maria Eduarda", "040430", 30, false);
        Paciente pEspecial = new Paciente("Eduardo", "3049340", 59, true);
        Medico m1 = new Medico("Dr.Rodrigo", "048874387", 40, "3245", "Ortopedista", 400);
        Medico m2 = new Medico("Dr.Amanda", "394883", 35, "3456", "Pediatria", 700);

        LocalDateTime manha = LocalDateTime.of(2025, 4, 17, 8, 0, 0);
        LocalDateTime tarde = LocalDateTime.of(2025, 4, 17, 17, 0, 0);
        Quarto ala01 = new Quarto(01);
        Quarto ala02 = new Quarto(02);
        Quarto ala03 = new Quarto(03);


        AgendamentoConsulta agendamento1 = new AgendamentoConsulta(p1, m1, tarde, ala02, "Agendada");
        AgendamentoConsulta agendamento2 = new AgendamentoConsulta(p2, m2, manha, ala01, "Agendada");
        AgendamentoConsulta agendamento3 = new AgendamentoConsulta(pEspecial, m2, tarde, ala03, "Agendada");

        Hospital cadastro = new Hospital();
        // Internacao internacao3 = new Internacao(pEspecial, m2, manha, tarde, ala02, 600);
        // pEspecial.adicionarinternacao(internacao3);
        // pEspecial.adicionarConsulta(agendamento3);

        
        // agendamento3.aplicarDescontoEspecial();
        
        //  agendamento2.exibiragendamento();

        //  m2.adicionarHorarioAgenda(agendamento2);
        //  m2.adicionarHorarioAgenda(agendamento3);
        // //  m2.exibirInformacoes();
        // //  m2.exibirAgendaMedico();
        
        
        // m2.exibirInformacoes();

        // cadastro.CadastrarPaciente(p1);
        // cadastro.CadastrarMedico(m2);
        // cadastro.CadastrarPaciente(pEspecial);

        // cadastro.PacientesCadastrados(cadastro);
        // cadastro.MedicosCadastrados(cadastro);
        p1.adicionarConsulta(agendamento3);
        
        p1.getHistoricConsultas();

        cadastro.CadastrarPaciente(pEspecial);
        cadastro.CadastrarPaciente(p2);
        cadastro.PacientesCadastrados(cadastro);
        




       
     }
        


}










    

