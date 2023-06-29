/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Theu
 */
public class Util {
    public static String formatarData(LocalDate data){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatar.format(data);
    }
    
    public static String formatarDinheiro(double valor) {
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(valor);
    }
}
