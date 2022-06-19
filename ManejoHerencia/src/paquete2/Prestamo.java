/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario ;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;
    
    
    public Prestamo(Persona n, int a, String user){
        beneficiario = n;
        tiempoPrestamo = a;
        ciudadPrestamo = user;
    }
    
    public void establecerBeneficiario(Persona bene){
        beneficiario = bene;
    }
  
    public void establecerTiempoPrestamo(int tiem){
        tiempoPrestamo = tiem;
    }
    
    public void establecerCiudadPrestamo(String ciud){
        ciudadPrestamo = ciud;
    }
    
    public Persona obtenerBeneficiario(){
        return beneficiario;  
    }
 
    public int obtenerTiempoPrestamo(){
        return tiempoPrestamo; 
    }

    public String obtenerCiudadPrestamo(){
        return ciudadPrestamo; 
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s"
                + "Tiempo de préstamos en meses: %s\n"
                + "Ciudad del préstamo: %s\n", 
                beneficiario,
                tiempoPrestamo,
                ciudadPrestamo.toUpperCase());
        return cadena;
    }
    

}
