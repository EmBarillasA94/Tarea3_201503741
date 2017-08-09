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
public class Palindromo {

    public Palindromo() {
    }
    String palabra;
    String SinEspacios = "";
    String v;

    void palindromo() {
        System.out.println("----------------------------");
        System.out.println("    Palabras Palindromas    ");
        System.out.println("");
        System.out.println("      Ingrese Palabra");
        Scanner texto = new Scanner(System.in);
        System.out.print("  ");
        palabra = texto.nextLine();
        
        //quitando los espacion de la frase 
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                SinEspacios += palabra.charAt(i);
            }
        }
        //comparando las letras
        int contador=SinEspacios.length()-1;
        for (int i = 0; i < contador; i++) {
            if(SinEspacios.charAt(i)==SinEspacios.charAt(contador-i)){
                v="   ¡SI ES PALINDROMA!!!!!";
                break;
            }else{
                v="   ¡NO ES PALINDROMA!!!!!";
            }
        }
        System.out.println(v);
        System.out.println("----------------------------");
        System.out.println("");
        new Menu().menu();
    }
}
