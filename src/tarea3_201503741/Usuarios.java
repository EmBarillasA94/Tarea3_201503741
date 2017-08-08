/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201503741;

import java.util.Scanner;

/**
 *
 * @author Eddy Alejandro
 */
public class Usuarios {
    public Usuarios(){
    }
    
    
    int nUsuarios;
    Scanner entrada = new Scanner(System.in);
    void usuarios(){
        System.out.println("Menú de Usuarios");
        System.out.println("");
        System.out.println("1. Ingrese Usuario");
        System.out.println("2. Mostrar todos los Usuarios");
        System.out.println("3. Mostrar un Usuario Personalizado");
        System.out.println("4. Menú Principal");
        System.out.println("5. Salir");
        
        
        nUsuarios = entrada.nextInt();
        
        switch(nUsuarios){
            case 1:
                ingreso();
                break;
            case 2:
                mostrar();
                break;
            case 3:
                personalizado();
                break;
            case 4:
                new Menu().menu();
                break;
            case 5:
                break;
        }
    }

    private void ingreso() {
        Scanner ingreso = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese Usuario");
        nombre=ingreso.nextLine();
    }

    private void mostrar() {
        System.out.println("Mostrar todos los Usuarios");
    }

    private void personalizado() {
        System.out.println("Mostar un Usuario Personalizado");
        System.out.println("Ingrese Usuario");
    }
}
