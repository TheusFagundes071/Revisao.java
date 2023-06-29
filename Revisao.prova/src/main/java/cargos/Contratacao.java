/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargos;

import funcionario.Funcionario;

/**
 *
 * @author Theu
 */
public interface Contratacao {
    public void admitir(Funcionario funcionario);
    public void demitir(Funcionario funcionario);
    
}
