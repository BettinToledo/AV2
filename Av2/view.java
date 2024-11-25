package view;

import controller.FuncionarioController;
import model.Desenvolvedor;
import model.Gerente;

import java.util.Scanner;

public class FuncionarioView {
    public static void main(String[] args) {
        FuncionarioController controller = new FuncionarioController();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o tipo de funcionário (1-Desenvolvedor, 2-Gerente): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();

                    if (tipo == 1) {
                        controller.cadastrarFuncionario(new Desenvolvedor(nome, salario));
                    } else if (tipo == 2) {
                        controller.cadastrarFuncionario(new Gerente(nome, salario));
                    }
                }
                case 2 -> controller.listarFuncionarios();
                case 3 -> {
                    System.out.print("Índice do funcionário para atualizar: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo salário: ");
                    double novoSalario = scanner.nextDouble();
                    controller.atualizarFuncionario(index, novoNome, novoSalario);
                }
                case 4 -> {
                    System.out.print("Índice do funcionário para excluir: ");
                    int index = scanner.nextInt();
                    controller.excluirFuncionario(index);
                }
                case 5 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}