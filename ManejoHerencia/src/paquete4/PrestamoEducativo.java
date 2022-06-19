/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPrestamo;
    
    public PrestamoEducativo(Persona n, int t, String ciud, String z,
            InstitucionEducativa x, double v) {
        super(n, t, ciud);
        nivelEstudio = z;
        centroEducativo = x;
        valorCarrera = v;
    }
    
     @Override
    public void establecerCiudadPrestamo(String ciud){
        ciudadPrestamo = ciud.toUpperCase(); 
    }
    
     public void establecerNivelEstudio(String tipo){
        nivelEstudio = tipo;
    }
    
    public void establecerCentroEducativo(InstitucionEducativa valor){
        centroEducativo = valor;
    }
    
    public void establecerValorCarrera(double valor){
        valorCarrera = valor;
    }
    
    public void calcularValorMensualPrestamo(){
        valorMensualPrestamo = (valorCarrera/tiempoPrestamo) - ((valorCarrera/tiempoPrestamo)*0.10);
    }

    public String obtenerTipoAutomovil(){
        return nivelEstudio; 
    }

    public InstitucionEducativa obtenerMarcaAutomovil(){
        return centroEducativo;
    }

    public double obtenerGarante(){
        return valorCarrera;
    }
    
    public double obtenerValorAutomovil(){
        return valorMensualPrestamo;
    }
    
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("-----------------------\n"
                + "-Beneficiario-\n"
                + "%s"
                + "-Centro Educativo-\n%s"
                + "Nivel de Estudio: %s\n"
                + "Valor de la Carrera: %.2f\n"
                + "Valor Mensual del préstamo: %.2f\n"
                + "-----------------------\n",
                super.toString(),
                centroEducativo,
                nivelEstudio,
                valorCarrera,
                valorMensualPrestamo);
        
        return cadenaFinal;
    }
    
}
