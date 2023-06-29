/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

/**
 *
 * @author Theu
 */
public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viúvo");
    
    protected String texto;
    
//    CONSTRUTOR

    private EstadoCivil(String texto) {
        this.texto = texto;
    }
    
//    GETTER E SETTER

    public String getTexto() {
        return texto;
    }
    
}
