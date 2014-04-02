package aula6;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Aula6 {

    public static void main(String[] args) {
       
        // variaveis
        float nota1 = 0.0f;
        float nota2 =0.0f;
        float media = 0.0f;
        //Scanner leitor = new Scanner(System.in);
        
        
        //System.out.println("Digite a nota 1:");
        //nota1 = leitor.nextFloat();
        String nota1String = JOptionPane.showInputDialog
                ("Digite a nota 1:");
        nota1 = Float.parseFloat(nota1String);
        
        // leitura nota 2 diretamente
        nota2 = Float.parseFloat(
                JOptionPane.showInputDialog(
                        "Digite a nota 2:"));
        
        
        //System.out.println("Digite a nota 2:");
        //nota2 = leitor.nextFloat();
        
        // processamento
        media = (nota1 + nota2)/2;
        
        // conceito A
        if (media >= 9 && media <= 10){
            // A
            //System.out.println("Conceito A");
            JOptionPane.showMessageDialog(null, "Conceito A");
        }
        // conceito B
        else if (media >= 8 && media < 9){
//            System.out.println("Conceito B");
            JOptionPane.showMessageDialog(null, "Conceito B");
        }
        // C
        else if (media >= 7 && media < 8){
//            System.out.println("Conceito C");
            JOptionPane.showMessageDialog(null, "Conceito C");
        }
        else {
//            System.out.println("Conceito D");
              JOptionPane.showMessageDialog(null, "Conceito D");

        }
        
        
        
        /*
        Tarefa 1:
        - Fazer um programa para ler 2 notas, calcular a
          m??dia e de acordo com a tabela abaixo, informar
          o conceito A, B, C ou D.
        A -> m??dia menor ou igual que 10 e maior ou igual que 9;
        B -> m??dia menor que 9 e maior ou igual que 8;
        C -> m??dia menor que 8 e maior ou igual que 7;
        D -> m??dia menor que 7;
        
        */
        
    }
    
}
