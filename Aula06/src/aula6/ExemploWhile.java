/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula6;

import javax.swing.JOptionPane;

/**
 *
 * @author douglasdanieldelfrari
 */
public class ExemploWhile {
   
    // fazer a tabuada aparecer na tela de acordo com a escolha do
    // usuario. Ex. Escolheu a tabuada do 3:, entao deve mostrar:
    /*
     3 x 1 = 3
     3 x 2 = 6
     3 x 3 = 9
     3 x 4 = 12
     3 x 5 = 15
     3 x 6 = 18
     3 x 7 = 21
     3 x 8 = ...
    
    */
    
    public static void main(String[] luluzinha) {
    
        
        int tabuada = 0;
        
        String numeroTabuada = JOptionPane.showInputDialog(
                "Qual numero da tabuada deseja exibir (1 a 10) ?");
        
        tabuada = Integer.parseInt(numeroTabuada);
        
           String resultadoTabuada =  
                        "1 x "+tabuada+" = "+(tabuada * 1)+"\n"+
                        "2 x "+tabuada+" = "+(tabuada * 2)+"\n"+
                        "3 x "+tabuada+" = "+(tabuada * 3)+"\n"+
                        "4 x "+tabuada+" = "+(tabuada * 4)+"\n"+
                        "5 x "+tabuada+" = "+(tabuada * 5)+"\n"+
                        "6 x "+tabuada+" = "+(tabuada * 6)+"\n"+
                        "7 x "+tabuada+" = "+(tabuada * 7)+"\n"+
                        "8 x "+tabuada+" = "+(tabuada * 8)+"\n"+
                        "9 x "+tabuada+" = "+(tabuada * 9)+"\n"+
                        "10 x "+tabuada+" = "+(tabuada * 10)+"\n";
        
        JOptionPane.showMessageDialog(null, resultadoTabuada);
      
        
    }
    
}
