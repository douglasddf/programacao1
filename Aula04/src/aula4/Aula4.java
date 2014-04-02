/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula4;

import java.util.Scanner;

/**
 *
 * @author douglasdanieldelfrari
 */
public class Aula4 {
    
    public static void main(String[] argumentos){
        
        // declarando variaveis de entrada do problema
        float nota1;
        float nota2;
        float media;
        String nome;
        boolean situacaoAprovado = false;
        
        Scanner entradaDados = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = entradaDados.nextLine();

        System.out.print("Digite nota 1: ");
        nota1 = entradaDados.nextFloat();
        
        System.out.print("Digite nota 2: ");
        nota2 = entradaDados.nextFloat();
        
        
        // PROCESSAMENTO
        media = (nota1 + nota2) / 2;
        
        
        if (media >= 7) {
            // aprovado
            situacaoAprovado = true;
        } else {
            // recuperacao
            situacaoAprovado = false;
        }
        
        // saida de dados final
        if (situacaoAprovado){
            // usar para APROVADO
            System.out.println(nome+"\nNota 1: "+nota1+"\nNota 2: "+nota2+
                               "\nMédia: "+media+"\nSituaçõo: APROVADO");
        } else {
            // usar para RECUPERACAO
            System.out.println(nome+"\nNota 1: "+nota1+"\nNota 2: "+nota2+
                               "\nMédia: "+media+"\nSituação: REPROVADO");
            
        }
        
        // libera recursos do Scanner
        entradaDados.close();
        entradaDados = null;
        
        
        // TAREFA 1
        // Fazer um programa que leia o nome e as 
        // duas notas (nota1 e nota2) e calcule a 
        // média. Deve informar se foi APROVADO ou RECUPERAÇÃO
   
        
        // exemplo de saída esperada:
        // -------------- 
        // DANIEL DA SILVA
        // Nota 1: 7.0
        // Nota 2: 8.0
        // Média: 7.5
        // situação: APROVADO
        // ---------------
        
    }
    
}
