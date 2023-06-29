/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juridica;

/**
 *
 * @author Theu
 */
public enum Setor {
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material Construção"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimenticio");
    
    protected String nome;
    
//    CONSTRUTOR

    private Setor(String nome) {
        this.nome = nome;
    }
    
//    getter

    public String getNome() {
        return nome;
    }
    
    
}
