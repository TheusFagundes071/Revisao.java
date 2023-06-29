/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juridica;

import Util.Util;

/**
 *
 * @author Theu
 */
public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    
    //CONSTRUTOR

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    
    //GETTER E SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "\nNome:" + nome + 
                "\nCategoria:" + categoria + 
                "\nPreço:" + Util.formatarDinheiro(preco);
    }
    
    
}
