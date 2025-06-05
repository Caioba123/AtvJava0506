/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Aluno
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Cliente {
    String nome;
    String cpf;
    String idade;
    String telefone;
    String endereco;

    public Cliente(String nome, String cpf, String idade, String telefone , String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("telefone: " + telefone);
        System.out.println("endereco " + endereco);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ArrayList<Cliente> veterinarios = new ArrayList<>();

        System.out.println("Ola, bom dia!");
        System.out.println("Voce deseja se cadastrar como cliente?");
        String cadastrar = tec.nextLine();
        
        
        while (true) {
            
            System.out.println("Digite uma opcao:");
            System.out.println("1 - Cadastrar Novo Cliente");
            System.out.println("2 - Mostrar Clientes Cadastrados");
            System.out.println("3 - Sair");

            String opcao = tec.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Insira o nome:");
                    String nome = tec.nextLine();
                    System.out.println("Insira o CPF:");
                    String cpf = tec.nextLine();
                    System.out.println("Insira a idade:");
                    String idade = tec.nextLine();
                    System.out.println("Insira o seu telefone:");
                    String telefone = tec.nextLine();
                    System.out.println("Insira o seu endereco:");
                    String endereco = tec.nextLine();

                    Cliente novo = new Cliente(nome, cpf, idade, telefone , endereco);
                    veterinarios.add(novo);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case "2":
                    if (veterinarios.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado ainda.");
                    } else {
                        System.out.println("Clientes cadastrados:");
                        for (Cliente v : veterinarios) {
                            v.mostrarInformacoes();
                        }
                    }
                    break;

                case "3":
                    System.out.println("Sistema fechado.");
                    return;

                default:
                    System.out.println("Opção invalida. Tente novamente.");
                    break;
            }
        }
    }
}


