package funcionario;

import Util.Util;
import fisica.EstadoCivil;
import fisica.Fisica;
import fisica.Genero;
import java.time.LocalDate;
import pessoa.Endereco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Theu
 */
public abstract class Funcionario extends Fisica implements SalarioFinal{
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;
    
    
//    CONSTRUTOR

    public Funcionario(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }
    
    //GETTER E SETTER

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatriculs(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nCpf:" + cpf + 
                "\nRg:" + rg + 
                "\nMatrícula:" + matricula + 
                "\nSetor=" + setor.texto; 
                
    }
    
    
}
