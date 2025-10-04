package entities;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa{
    private List<String> historicoconsultas;
    private List<String> historicointernacoes;
    private boolean temPlanoDesaude;

    public Paciente(String nome, String cpf, int idade, boolean temPlanoDesaude){
        super(nome,cpf,idade);
        this.temPlanoDesaude = temPlanoDesaude;
        this.historicoconsultas = new ArrayList<>();
        this.historicointernacoes = new ArrayList<>();


    }
    public void adicionarConsulta(String dataEspecialidade){
        this.historicoconsultas.add(dataEspecialidade);
        System.out.println("Consulta de " + dataEspecialidade + " adicionada para " + this.getNome());
    }

    public void adicionarinternacao(String dataMotivo){
        this.historicointernacoes.add(dataMotivo);
        System.out.println("Internação (" + dataMotivo + ") adicionada para " + this.getNome());
    }

    public void TemPlano(){
        
    }
}
