/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej05;

import exceptions.miException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rembe
 */
public class EJ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 500 + 1);
        int guess = 0, intentos = 0;
        
        do {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            try {
                System.out.println("Adivina el valor entre 1 y 500!");
                guess = leer.nextInt();
                intentos++;

                if (guess < 1 || guess > 500) {
                    throw new miException("entre 1 y 500 dije");
                } else if (guess < randomNum) {
                    System.out.println("El numero que buscas en mayor al ingresado");
                } else if (guess > randomNum) {
                    System.out.println("El numero que buscas es menor al ingresado");
                }
                } catch (miException e) {
                System.out.println(e);

            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Creo que eso no era un numero");

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("akajskasjka esta no te la sabia");
            } /*finally {
                guess = 0;
            }*/

        } while (guess != randomNum);

        System.out.println("El numero era " + randomNum + "!"
                + "\nTe tomó " + intentos + " intentos");
    }
    
}
