/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrador;

import servicios.ServiciosIronMan;

/**
 *
 * @author rembe
 */
public class Integrador {

    public static void main(String[] args) {
        ServiciosIronMan im = new ServiciosIronMan();
        
//        int x = (int) (Math.random() * 10 + 1);
//        System.out.println("x"+x);
//        Float x = (float) Math.random();
//3.4028235E38
//        System.out.println(Float.MAX_VALUE-34927.523);
        im.mostraArmaduraIronMan();
        im.informeBateria();
        System.out.println("---------------");
//        im.informeBateria();
        
        im.dañosArmadura();

        im.repararDañoBota();

        im.repararDañoConsola();

        im.repararDañoGuantes();
        im.repararDañoSintetizador();
        im.reparacionesBotas();
        im.reparacionesConsola();
        im.reparacionesGuante();
        System.out.println("----");
//        im.crearRadar();
//        im.destruyendoEnemigos();

    }

    
}
