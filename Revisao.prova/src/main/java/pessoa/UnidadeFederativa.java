package pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Theu
 */
public enum UnidadeFederativa {
    BAHIA("Bahia","BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro","RJ");
    
    protected String nome;
    protected String sigla;
    

   //CONSTRUTOR

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    
    //GETTER

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    




}
    


            

            
