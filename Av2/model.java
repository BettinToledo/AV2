package model;

public abstract class Funcionario{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void SetNome(String nome){
        this.nome = nome:
    }

    public double getSalario(){
        return salario;
    }

    public void SetSalario(double salario){
        this.salario = salario;
    }

    public void receberAumento(double aumento){
        this.salario += aumento;
    }

    public abstract String mostrarDetalhes();
}

/* DESENVOLVER */

public interface desevolve{
    void codar():
    void resolverProblemas():
}

/* GERENCIAR */

public interface Treina{
    void organizarEquipe();
    void conduzirReunioes();
}

/* Treinar */

public interface Treina {
    void ensinarTecnologia();
    void motivarEquipe();
}

/* DESENVOLVER CLASSE ESPECÍFICA*/

public class Desenvolver extends Funcionario implements Desenvolve {
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    public void codar(){
        System.out.println(getNome() + "está codando...");
    }

    public void resolverProblemas(){
        System.out.println(getNome() + "está resolvendo poblemas técnicos.");
    }

    public String mostrarDetalhes(){
        return "Desenvolvedor: " + getNome() + " Salário: " + getSalario();
    }
}

/* GERENTE CLASSE ESPECÍFICA*/

public class Gerente extends Funcionario implements Gerencia {

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    public void organizarEquipe(){
        System.out.println(getNome() + "está organizando a equipe.");
    }

    public void conduzirReunioes(){
        System.out.println(getNome() + "está conduzindo reuniões.");
    }

    public String mostrarDetalhes(){
        return "Gerente: " + getNome() + " Salário: " + getSalario();
    }
}