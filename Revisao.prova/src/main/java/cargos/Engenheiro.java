/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargos;

import fisica.EstadoCivil;
import fisica.Genero;
import funcionario.Funcionario;
import funcionario.Setor;
import java.time.LocalDate;
import pessoa.Endereco;

/**
 *
 * @author Theu
 */
public class Engenheiro extends Funcionario{
    private String crea;
    
//    CONSTRUTOR

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crea = crea;
    }

    
    
//    GETTER E SETTER

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

//    SALARIO
    @Override
    public double getSalarioFinal() {
    return super.salario;
    }
    
//    TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nCrea:" + crea + 
                "\nSalário Final:" +getSalarioFinal(); 
    }
    
    
    
}
