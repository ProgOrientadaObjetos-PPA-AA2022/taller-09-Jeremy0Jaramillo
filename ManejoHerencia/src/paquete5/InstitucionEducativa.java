/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author fabri
 */
public class InstitucionEducativa {
    protected String nombresInstitucion;
    protected String siglasInstitucion;
    
    
    public InstitucionEducativa(String n, String a){
        nombresInstitucion = n;
        siglasInstitucion = a;
    }
    
    
    public void establecerNombresInstitucionEducativa(String nom){
        nombresInstitucion = nom;
    }
  
    public void establecerSiglasInstitucionEducativa(String sigl){
        siglasInstitucion = sigl;
    }
    
    public String obtenerNombresInstitucionEducativa(){
        return nombresInstitucion;  
    }
 
    public String obtenerSiglasInstitucionEducativa(){
        return siglasInstitucion; 
    }
    
    @Override
    public String toString(){
        String cadena = String.format("  Nombre: %s\n"
                + "  Siglas: %s\n", 
                nombresInstitucion,
                siglasInstitucion);
        
        return cadena;
    }
    

}
