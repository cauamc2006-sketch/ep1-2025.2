package entities;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
    
    private String CRM;
    private Especialidade Especialidade;
    private double CustoConsulta;
    private List<String> Agenda;
    
    public Medico (String nome, String cpf, int idade, String CRM, Especialidade Especialidade, double CustoConsulta){
        super(nome, cpf, idade);
        this.CRM = CRM;
        this.Especialidade = Especialidade;
        this.CustoConsulta = CustoConsulta;
        this.Agenda = new ArrayList<>();
    }
    
    public void adicionarHorarioAgenda(String DiaHorario){
        this.Agenda.add(DiaHorario);
        System.out.println(DiaHorario);
        

    }

    public void InfoMedico(){
        System.out.println("CRM: " + CRM);
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Custo da consulta: R$" + CustoConsulta);
        System.out.println("Horarios disponíveis:");
    }

    public String getCRM(){
        return CRM;
    }

    public Especialidade getEspecialidade(){
        return Especialidade;
    }

    public double getCustoConsulta(){
        return CustoConsulta;
    }

}