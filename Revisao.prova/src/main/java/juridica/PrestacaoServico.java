/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juridica;

import Util.Util;
import java.time.LocalDate;
import pessoa.Endereco;

/**
 *
 * @author Theu
 */
public class PrestacaoServico extends Juridica{
    
    private LocalDate contratoInicio;
    private LocalDate contratoFinal;
    
    //CONSTRUTOR

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFinal, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFinal = contratoFinal;
    }
    
    
//    GETTER E SETTER

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFinal() {
        return contratoFinal;
    }

    public void setContratoFinal(LocalDate contratoFinal) {
        this.contratoFinal = contratoFinal;
    }
    
//    TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nContrato Início:" + Util.formatarData(contratoInicio) + 
                "\nContrato Final=" + Util.formatarData(contratoFinal);
    }
    
    
    
}
