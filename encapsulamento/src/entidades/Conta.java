/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author nb
 */
public class Conta {
    
    
    public String nome;
    public String cpf;
    public Double saldo;
    
    
    public Conta(){
        saldo = 0.0;
    }
    public Conta(String nome, String cpf){
        this();
        this.nome = nome;
        this.cpf = cpf;
        
    }
    public Double getSaldo (){
        return saldo;
    }
    public void depositar (double valor) {
        saldo = saldo + valor;
     
    }
    public void sacar (double valor){
        if (saldo < valor) {
        }
        saldo = saldo - valor;
    }
}
