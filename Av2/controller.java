package controller;

import model.Funcionario;
import java.util.ArrayList;

public class FuncionarioController{
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        System.out.println(funcionario.getNome() + " cadastro com sucesso!");
    }

    public void listarFuncionarios(){
        if(funcionarios.isEmpty()){
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for(Funcionario f : funcionarios){
            System.out.println(f.mostrarDetalhes());
        }
    }

    public void atualizarFuncionario(int index, String novoNome, double novoSalario){
        if(index >= 0 && index < funcionarios.size()) {
            Funcionario funcionario = funcionarios.get(index);
            funcionario.setNome(novoNome);
            funcionario.setSalario(novoSalario);
            System.out.println("Funcionário atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void excluirFuncionario(int index) {
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.remove(index);
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

}