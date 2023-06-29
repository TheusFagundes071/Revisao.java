/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juridica;

import pessoa.Endereco;

/**
 *
 * @author Theu
 */
public class Fornecedor extends Juridica{
    private Setor setor;
    private Produto produto;
    
//    CONSTRUTOR

    public Fornecedor(Setor setor, Produto produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.setor = setor;
        this.produto = produto;
    }
    
//    GETTER E SETTER

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
//    TO STRING

    @Override
    public String toString() {
        return super.toString() +
                "\nSetor:" + setor + 
                "\nProduto:" + produto;
    }
    
    
}
