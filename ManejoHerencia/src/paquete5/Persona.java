/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author fabri
 */
public class Persona {
    protected String nombresPersona;
    protected String apellidosPersona;
    protected String usernamePersona;
    
    
    public Persona(String n, String a, String user){
        nombresPersona = n;
        apellidosPersona = a;
        usernamePersona = user;
    }
    
    
    public void establecerNombresPersona(String nom){
        nombresPersona = nom;
    }
  
    public void establecerApellidoPersona(String ape){
        apellidosPersona = ape;
    }
    
    public void establecerIdentificacionPersona(String user){
        usernamePersona = user;
    }
    
    public String obtenerNombresPersona(){
        return nombresPersona;  
    }
 
    public String obtenerApellidoPersona(){
        return apellidosPersona; 
    }

    public String obtenerIdentificacionPersona(){
        return usernamePersona; 
    }
    
    @Override
    public String toString(){
        String cadena = String.format("  Nombre: %s\n"
                + "  Apellido: %s\n"
                + "  Username: %s\n", 
                nombresPersona,
                apellidosPersona,
                usernamePersona);
        
        return cadena;
    }
    

}
