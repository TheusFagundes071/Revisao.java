package pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Theu
 */
public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;
    
    
    //CONSTRUTOR

    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    //GETTER E SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "\nNome:" + nome + 
                "\nTelefone:" + telefone + 
                "\nEmail:" + email + 
                "\nEndereço:" + endereco;
    }
    
    
}
