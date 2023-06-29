/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juridica;

import pessoa.Endereco;
import pessoa.Pessoa;

/**
 *
 * @author Theu
 */
public abstract class Juridica extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;
    
    //CONSTRUTOR

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
//    GETTER E SETTER

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
//    TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nCnpj:" + cnpj + 
                "\nInscrição Estadual:" + inscricaoEstadual;
    }
    
    
    
    
}
