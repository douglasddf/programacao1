/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author douglasdanieldelfrari
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // saida de dados para informar ao usuario o que digitar
        System.out.println("Digite seu nome");
        
        // entrada para ler o nome
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        String nome = entrada.nextLine();
        
        
        System.out.println("Nome informado: " + nome);
        
        
        /*
        
        // atribuicao direta do valor 'DOuglas' p/ variavel nome
        String nome = "DOUGLAS";
        int idade = 36;
        double salario = 1000.0;
        
        // ex. sa??da de dados com CONCATENACAO
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("salario: " + salario);
          */      
                
    } // fim main

} // fim do algoritmo
