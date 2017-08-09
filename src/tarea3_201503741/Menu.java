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
public class Menu {

    public Menu() {
    }
    int decision;

    void menu() {
        System.out.println("---------------------------------");
        System.out.println("             Tarea 3             ");
        System.out.println("                                 ");
        System.out.println("            201503741            ");
        System.out.println("                                 ");
        System.out.println("       1. Usuarios               ");
        System.out.println("       2. Palabras Palindromas   ");
        System.out.println("       3. Salir                  ");
        System.out.println("---------------------------------");

        Scanner entrada = new Scanner(System.in);
        decision = entrada.nextInt();

        switch (decision) {
            case 1:
                new Usuarios().usuarios();//llamada al menu de usuarios
                break;
            case 2:
                new Palindromo().palindromo();// llamada al menu de los palindromos
                break;
            case 3:
                break;
        }
    }
}
