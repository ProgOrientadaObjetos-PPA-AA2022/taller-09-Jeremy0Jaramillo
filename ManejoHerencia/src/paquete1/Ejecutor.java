/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        int num;
        boolean ola = true;
        String confir;
        String cadenas = "";
        
        while (ola) {
            System.out.println("Ingrese '1' para ingresar un Préstamo para Automóvil o"
                    + " '2' para ingresar un Préstamo Edcativo:");
            num = entry.nextInt();
            
            if (num == 1 || num == 2) {
                entry.nextLine();
                
                System.out.println("Ingrese su nombre:");
                String nombre = entry.nextLine();
                System.out.println("Ingrese su apellido:");
                String apellido = entry.nextLine();
                System.out.println("Ingrese su Username:");
                String username = entry.nextLine();

                Persona persia = new Persona(nombre,
                        apellido, username);

                System.out.println("Ingrese la ciudad del préstamo:");
                String ciudad = entry.nextLine();
                System.out.println("Ingrese el tiempo en meses del préstamo:");
                int tiempoMes = entry.nextInt();

                if (num == 1) {
                    entry.nextLine();

                    System.out.println("Ingrese el tipo de Automóvil:");
                    String autTipo = entry.nextLine();
                    System.out.println("Ingrese la marca del Automóvil:");
                    String marcAuto = entry.nextLine();
                    System.out.println("Ingrese el valor del Automóvil:");
                    double valorAuto = entry.nextDouble();

                    PrestamoAutomovil prestiaAuto = new PrestamoAutomovil(persia,
                            tiempoMes, ciudad, autTipo, marcAuto, valorAuto);
                    
                    prestiaAuto.calcularValorPagoMensual();

                    cadenas = String.format("%s%s", cadenas, prestiaAuto);

                    entry.nextLine();

                    System.out.println("\nIngrese 's' para salir del programa");
                    confir = entry.nextLine();
                    if (confir.equals("s")) {
                        ola = false;
                    }
                } else if (num == 2) {
                    entry.nextLine();

                    System.out.println("Ingrese el nombre de la Institución:");
                    String nombInst = entry.nextLine();
                    System.out.println("Ingrese las siglas de esta Institución:");
                    String siglInst = entry.nextLine();

                    InstitucionEducativa instia = new InstitucionEducativa(nombInst, siglInst);

                    System.out.println("Ingrese su nivel de Estudio:");
                    String nivEst = entry.nextLine();
                    System.out.println("Ingrese el valor de la Carrera:");
                    double valCar = entry.nextDouble();

                    PrestamoEducativo prestiaEduc = new PrestamoEducativo(persia,
                            tiempoMes, ciudad, nivEst, instia, valCar);
                    
                    prestiaEduc.calcularValorMensualPrestamo();

                    cadenas = String.format("%s%s", cadenas, prestiaEduc);

                    entry.nextLine();

                    System.out.println("\nIngrese 's' para salir del programa");
                    confir = entry.nextLine();
                    if (confir.equals("s")) {
                        ola = false;
                    }
                }

            } else {
                entry.nextLine();
                
                System.out.println("Opción fuera de límites!");
                System.out.println("Ingrese 's' para salir del programa");
                confir = entry.nextLine();
                
                if (confir.equals("s")) {
                    ola = false;
                }
            }
        }
        System.out.println(cadenas);
    }
}
