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
public enum Genero {
    MASCULINO("Masculino",'M'),
    FEMININO("Feminino",'F');
    
    
    protected String texto;
    protected char caractere;
    
//    CONSTRUTOR

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }
    
//    GETTER

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
    
    
}
