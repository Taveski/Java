/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aovivo01;

import javax.swing.JOptionPane;


/**
 *
 * @author nb
 */
public class Aovivo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String idade = JOptionPane.showInputDialog("Digite sua idade:");
        
        try {
            int idadeNumero = Integer.parseInt(idade);
            }
        catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(null,"A idade digitada deve ser numérica!");
        }finally{
            JOptionPane.showMessageDialog(null,"Programa finalizado!");

    }
}
}
    

