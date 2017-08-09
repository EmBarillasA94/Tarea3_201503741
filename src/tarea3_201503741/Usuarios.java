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

    public Usuarios() {
    }

    int nUsuarios;
    String[] usuarios = new String[5];
    Scanner entrada = new Scanner(System.in);

    void usuarios() {
        System.out.println("------------------------------------------");
        System.out.println("             Menú de Usuarios             ");
        System.out.println("                                          ");
        System.out.println("   1. Ingrese Usuario                     ");
        System.out.println("   2. Mostrar todos los Usuarios          ");
        System.out.println("   3. Mostrar un Usuario Personalizado    ");
        System.out.println("   4. Menú Principal                      ");
        System.out.println("   5. Salir                               ");
        System.out.println("------------------------------------------");

        nUsuarios = entrada.nextInt();

        switch (nUsuarios) {
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
        System.out.println("-----------------------------");
        System.out.println("       Ingrese Usuario       ");
        Scanner ingreso = new Scanner(System.in);
        String nombres;
        for (int i = 0; i <= 4; i++) {
            System.out.print("   "+(i+1)+": ");
            nombres = ingreso.nextLine();
            usuarios[i] = nombres;
            nombres = "";
        }
        System.out.println("   Lista de Usuarios llena  ");
        System.out.println("----------------------------");
        System.out.println("");
        usuarios();//regresar al menu de usuarios
    }

    private void mostrar() {
        System.out.println("----------------------------------");
        System.out.println("    Mostrar todos los Usuarios    ");
        for (int j = 0; j <= 4; j++) {
            System.out.print("       " + (j + 1) + ": ");
            System.out.println(usuarios[j]);
        }
        System.out.println("----------------------------------");
        System.out.println("");
        usuarios();//regresar al menu de usuarios
    }

    private void personalizado() {
        Scanner busqueda = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("    Mostar un Usuario Personalizado    ");
        System.out.println("            Ingrese Usuario");
        String buscar = "";
        String encontrado = "";
        System.out.print("        ");
        buscar = busqueda.nextLine();
        System.out.println("---------------------------------------");
        for (int i = 0; i <= 4; i++) {
            if (usuarios[i].equals(buscar)) {
                encontrado = usuarios[i];
                break;
            } else {
                encontrado = "ERROR!! No existe ningún usuario con esa coincidencia";
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("                           Usuario    ");
        System.out.println("    "+encontrado);
        System.out.println("-------------------------------------------------------------");
        System.out.println("");
        usuarios();// regreso al menu de usuarios
    }
}
