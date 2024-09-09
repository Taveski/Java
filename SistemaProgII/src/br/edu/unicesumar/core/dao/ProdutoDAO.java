/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unicesumar.core.dao;

import br.edu.unicesumar.core.entity.Produto;

/**
 *
 * @author roger
 */
public class ProdutoDAO {
    
    public void inserir(Produto produto){
        
        //Comandos do banco de dados
        System.out.println("Aqui vai começar a cadastrar o banco de dados");
        System.out.println("Produto a ser cadastrado " + produto.getNome());
        
        
    }
}
