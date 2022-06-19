/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import paquete2.Prestamo;
import paquete5.Persona;
/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante;
    private double valorAutomovil;
    private double valorPagoMensual;
    
    public PrestamoAutomovil(Persona n, int a, String user, String z,
            String x, double y) {
        super(n, a, user);
        tipoAutomovil = z;
        marcaAutomovil = x;
        valorAutomovil = y;
        garante = n;
    }
    
     @Override
    public void establecerCiudadPrestamo(String ciud){
        ciudadPrestamo = ciud.toLowerCase(); 
    }
    
     public void establecerTipoAutomovil(String tipo){
        tipoAutomovil = tipo;
    }
    
    public void establecerMarcaAutomovil(String valor){
        marcaAutomovil = valor;
    }
    
 
    public void establecerGarante(Persona pers){
        garante = pers; 
    }

    
    public void establecerValorAutomovil(double valor){
        valorAutomovil = valor;
    }
    
    public void calcularValorPagoMensual(){
        valorPagoMensual = valorAutomovil/tiempoPrestamo;
    }

    public String obtenerTipoAutomovil(){
        return tipoAutomovil; 
    }

    public String obtenerMarcaAutomovil(){
        return marcaAutomovil;
    }
    
   
    public Persona obtenerGarante(){
        return garante;
    }
   
    
    public double obtenerValorAutomovil(){
        return valorAutomovil;
    }
    
    public double obtenerValorPagoMensual(){
        return valorPagoMensual;
    }
    
    @Override
    public String toString(){
        
       String cadenaFinal = String.format("-----------------------\n"
               + "-Beneficiario-\n"
               + "%s"
               + "Tiempo de préstamos en meses: %s\n"
               + "Ciudad del préstamo: %s\n"
                + "Tipo de Automóvil: %s\n"
                + "Marca de Automóvil: %s\n"
                + "Valor de Automóvil: %.2f\n"
                + "Valor Mensual de pago del préstamo: %.2f\n"
               + "-----------------------\n",
                garante,
                obtenerTiempoPrestamo(),
                obtenerCiudadPrestamo().toLowerCase(),
                tipoAutomovil,
                marcaAutomovil,
                valorAutomovil,
                valorPagoMensual);
        return cadenaFinal;
    }
}
