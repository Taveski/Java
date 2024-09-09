/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication;
import entidades.Conta;

/**
 *
 * @author nb
 */
public class Program {
    
    public static void main (String[] args) {
        
       Conta c = new Conta();
        
        c.nome = "Fabiano";
        c.cpf = "09721375993";
        c.depositar(100.0);
        c.sacar(20);
        
        System.out.println(c.nome);
        System.out.println(c.cpf);
        System.out.println(c.saldo);
    }
    
}
