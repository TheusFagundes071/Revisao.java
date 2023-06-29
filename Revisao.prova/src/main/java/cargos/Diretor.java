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
public class Diretor extends Funcionario implements Contratacao{
    private double PREMIO=0.2;
    
//    CONSTRUTOR

    public Diretor(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

    
//    GETTER

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    
//    SALARIO
    @Override
    public double getSalarioFinal() {
    return super.getSalario() + (super.getSalario() * PREMIO);
    }
    
    
//TO STRING

    @Override
    public String toString() {
        return super.toString() 
                + "\nPrêmio:" + (PREMIO * 100) + " %" +
                "\nSalário:" +getSalarioFinal();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Empregado " +funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitido " +super.getNome());
    }
    
    

    
}
