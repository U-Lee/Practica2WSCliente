/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.cliente;

import mx.uacm.ws.Numeros;
import mx.uacm.ws.Numeros_Service;

/**
 *
 * @author Profesor
 */
public class Cliente {
  
    public static void main(String[] args) {
    
        Numeros_Service servicio= new Numeros_Service();
        Numeros ws = servicio.getNumerosPort();
        System.out.println(ws.numerosPrimos(1000));            
        
    }
}
