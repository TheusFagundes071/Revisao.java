/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author Theu
 */
public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    protected String texto;
    
//    CONSTRUTOR

    private Setor(String texto) {
        this.texto = texto;
    }
    
//    GETTER

    public String getTexto() {
        return texto;
    }
    
}
