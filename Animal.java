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


public class Animal {
    String nome;
    String idade;
    String caracteristicas;

    public Animal(String nome, String idade, String caracteristicas) {
        this.nome = nome;
        this.idade = idade;
        this.caracteristicas = caracteristicas;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Caracteristicas: " + caracteristicas);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();

        System.out.println("Ola, bom dia!");
        System.out.println("Voce deseja cadastrar o seu animal?");
        String cadastrar = tec.nextLine();
        System.out.println("Ola, Seja Bem-Vindo aos PetsDay!");
        
        OUTER:
        while (true) {
            System.out.println("Digite uma opcao:");
            System.out.println("1 - Cadastrar novo animal");
            System.out.println("2 - Mostrar informacoes cadastradas");
            System.out.println("3 - Sair");
            String opcao = tec.nextLine();
            switch (opcao) {
                case "1":
                case "Cadastrar novo animal":
                    System.out.println("Insira o tipo do seu animal:");
                    String tipo = tec.nextLine();
                    System.out.println("Insira o nome do seu animal:");
                    String nome = tec.nextLine();
                    System.out.println("Insira a idade do seu animal:");
                    String idade = tec.nextLine();
                    System.out.println("Diga as características do seu animal:");
                    String caracteristicas = tec.nextLine();
                    Animal cao = new Animal(tipo , nome, idade, caracteristicas);
                    animais.add(cao);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                case "2":
                case "Mostre as informacoes cadastradas":
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado ainda.");
                    } else {
                        System.out.println("Informacoes cadastradas:");
                        for (Animal a : animais) {
                            a.mostrarInformacoes();
                        }
                    }   break;
                case "3":
                case "Sair":
                    System.out.println("Encerrando o sistema.");
                    break OUTER;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
                    break;
            }
        }
    }
}
