/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import java.time.LocalDate;
import pessoa.Endereco;

/**
 *
 * @author Theu
 */
public class Cliente extends Fisica{
    
    private int protocoloAtendimento;
    
    
//  CONSTRUTOR

    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    
//    GETTER E SETTER

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
//    TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nProtocolo de atendimento:" + protocoloAtendimento;
    }
    
    
}
