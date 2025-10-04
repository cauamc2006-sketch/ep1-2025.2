import entities.Especialidade;
import entities.Medico;

public class Main {
    public static void main(String[] args) throws Exception {
        Especialidade pediatra = new Especialidade("Pediatra");
        Medico m1 = new Medico("Dr.Rodrigo Vieira", "034434344", 32, "345959", pediatra, 400);
        m1.exibirInformacoes();
        m1.InfoMedico();
        m1.adicionarHorarioAgenda("Segunda--18h00");
        m1.adicionarHorarioAgenda("Terça--20h00");
        m1.adicionarHorarioAgenda("Quarta--13h00");
    }
}
