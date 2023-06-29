/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import Util.Util;
import java.time.LocalDate;
import java.time.Period;
import pessoa.Endereco;
import pessoa.Pessoa;

/**
 *
 * @author Theu
 */
public abstract class Fisica extends Pessoa{
    
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;
    
    
//    CONSTRUTOR

    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }
    
    
    //GETTER E SETTER

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    //GET IDADE
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    
    
    @Override
    public String toString() {
        return super.toString() + 
                "\nGênero:" + genero.texto + 
                "\nEstado Civil:" + estadoCivil.texto + 
                "\nData de Nascimento:" + Util.formatarData(dataNascimento) +
                "\nIdade:" + getIdade();
    }
    
    
}
