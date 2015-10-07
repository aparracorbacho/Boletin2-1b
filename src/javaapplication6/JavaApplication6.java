/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base, altura;
        System.out.println("Introduce la base");
        Scanner baseTeclado = new Scanner(System.in);
        base = baseTeclado.nextFloat();
        System.out.print(System.getProperty("line.separator"));
        System.out.println("Introduce la altura");
        Scanner alturaTeclado = new Scanner(System.in);
        altura = alturaTeclado.nextFloat();
        System.out.print(System.getProperty("line.separator"));
        System.out.println("El area es: "+base*altura/2);
    }
    
}
