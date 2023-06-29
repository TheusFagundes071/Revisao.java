/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import cargos.Diretor;
import cargos.Engenheiro;
import cargos.Motoboy;
import fisica.Cliente;
import fisica.EstadoCivil;
import fisica.Genero;
import java.time.LocalDate;
import java.time.Month;
import juridica.Fornecedor;
import juridica.PrestacaoServico;
import juridica.Produto;
import juridica.Setor;
import pessoa.Endereco;
import pessoa.UnidadeFederativa;

/**
 *
 * @author Theu
 */
public class Main {
    public static void main(String[] args) {
        
//    JURIDICA    
    PrestacaoServico prestacaoservico = new PrestacaoServico(LocalDate.of(2020, Month.MARCH, 7), LocalDate.of(2022, Month.MARCH, 7), "(000-0-000-000)", "0", "Matheus", "(00) 00000-0000", "matheus@gmail.com", new Endereco("Rua 1", "1", "bloco 1", "1111-11", "Salvador", UnidadeFederativa.BAHIA));
    Fornecedor fornecedor = new Fornecedor(Setor.TECNOLOGIA, new Produto("Celular", "Z", 7000), "00000-00000-000", "1", "Kay", "(00)00000-0000", "kay@gmail.com", new Endereco("Rua 2", "2", "bloco 2", "2222-22", "Guarulhos", UnidadeFederativa.SAO_PAULO));
    
     
        System.out.println(prestacaoservico);
        
        System.out.println(fornecedor);
        
        
        
//    FISICA
     
    Cliente cliente = new Cliente(2, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2003, Month.JUNE, 6), "Ana", "(00) 00000-0000", "Ana@gmail.com", new Endereco("Rua 3", "3", "bloco 3", "3333-33", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        System.out.println("Cliente:");
        System.out.println(cliente);

        
    Diretor diretor = new Diretor("000-000-000-00", "000000000", "1", funcionario.Setor.ENGENHARIA, 1000, Genero.MASCULINO, EstadoCivil.SEPARADO, LocalDate.of(2002, Month.JUNE, 6), "Macita", "(00) 0000-0000", "Macita@gmail.com", new Endereco("Rua 4", "4", "bloco 4", "4444-44", "Camaçari", UnidadeFederativa.BAHIA));
    Engenheiro engenheiro = new Engenheiro("3", "000.000.000-00", "000.000.0.0.0", "2", funcionario.Setor.ENGENHARIA, 1000, Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(2001, Month.JUNE, 6), "Marcia", "(00) 0000-0000", "Marcia@gmail.com",new Endereco("Rua 5", "5", "bloco 5", "5555", "São Gonçalo", UnidadeFederativa.RIO_DE_JANEIRO));
    Motoboy motoboy = new Motoboy("5555", "000.000.000-00", "00000000", "5", funcionario.Setor.OPERACOES, 1000, Genero.MASCULINO, EstadoCivil.VIUVO, LocalDate.of(2000, Month.JUNE, 6), "Justin", "(00) 0000-0000", "justin@gmail.com", new Endereco("Rua 6", "6", "bloco 6", "6666", "Lauro", UnidadeFederativa.BAHIA));
    
    
        System.out.println("");
    diretor.admitir(diretor);
        System.out.println("");
    diretor.demitir(engenheiro);
        System.out.println("");
    diretor.demitir(motoboy);
    

        

        
        
        
}
    
    
}
