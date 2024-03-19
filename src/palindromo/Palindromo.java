/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author ucr
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack pila = new Stack();
        String textoOriginal = "Universidad";
        String sinEspacios = textoOriginal.replace(" ", "");
        String reverso = "";
        System.out.println("sinEspacios = " + sinEspacios);

        for (int i = 0; i < sinEspacios.length(); i++) {
            pila.push(sinEspacios.charAt(i));
        }
        int cap = pila.size();
       
        for (int i = 0; i < cap; i++) {
            reverso = reverso + pila.pop();
        }

        System.out.println("reverso = " + reverso);

        if (sinEspacios.equalsIgnoreCase(reverso)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        System.out.println("");
    }

}
