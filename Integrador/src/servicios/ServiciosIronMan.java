/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicios;

//@author rembe

import entidades.Armadura;
import entidades.ObjetosVarios;
import java.util.ArrayList;
import java.util.Scanner;

 
public class ServiciosIronMan {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //lista donde tendre los objetos varios q van a aparecer en el radar de ironman
    ArrayList<ObjetosVarios> varios = new ArrayList<>();

    Object[][][] radar = new Object[11][11][11];//creo array tipo objeto para agregar a iron man y a los demas objetos(buenos o malos)

    Float tiempoUsoArmadura = 0f;//uso momentaneamente para setear el tiempo
    //creo armadura
//    Armadura i1 = new Armadura(Integer.MIN_VALUE, Float.NaN, new Botas(), new Guantes(), new Consola(), new Sintetizador());

    Armadura i1 = new Armadura();

//muestro armadura con sus atributos
    public Armadura mostraArmaduraIronMan() {
        System.out.println(i1);
        System.out.println("------------");
//        System.out.println(i2);
        return i1;
//        System.out.println(i1.toString());
//        return i1;

    }

//muestro estado de la bateria en porcentaje
    public void informeBateria() {
        System.out.println("Informe de bateria ");
        //el nivel del reactor actual dividido en el nivel maximo del reactor  por cien 
        System.out.println("*El nivel de la bateria es de: " + (i1.getNivelReactor() / Float.MAX_VALUE) * 100 + " %");

    }
//    Mostrar Información del Reactor
//Hacer un método para que JARVIS informe el estado del reactor en otras dos unidades
//de medida. Hay veces en las que Tony tiene pretensiones extrañas. Buscar en Wikipedia
//la tabla de transformaciones.

//    Sufriendo Daños
//A veces los dispositivos de la armadura sufren daños para esto cada dispositivo contiene
//un atributo público que dice si el dispositivo se encuentra dañado o no. Al utilizar un
//dispositivo existe un 30% de posibilidades de que se dañe.
//La armadura solo podrá utilizar dispositivos que no se encuentren dañados.
    public void dañosArmadura() {
//llamo metodo if si son usadas algunas de las partes de las armaduras
        if (i1.caminar(tiempoUsoArmadura) != 0) {

//uso random para calcular un porcentaje y si esta dentro del porcentaje paso
//dañado a falso o verdadero segun corresponda
            System.out.println("dañado-prueba");

            if (Math.random() < 0.3) {
                i1.getUsoBotas().setDañado(true);
            } else {
                i1.getUsoBotas().setDañado(false);
            }
        }
        if (i1.correr(tiempoUsoArmadura) != 0) {
            System.out.println("u5dañado");

            if (Math.random() < 0.3) {
                i1.getUsoBotas().setDañado(true);
            } else {
                i1.getUsoBotas().setDañado(false);
            }
        }
        if (i1.propulsarse(tiempoUsoArmadura) != 0) {
            System.out.println("u4dañado");

            if (Math.random() < 0.3) {
                i1.getUsoBotas().setDañado(true);
            } else {
                i1.getUsoBotas().setDañado(false);
            }

        }
        if (i1.volar(tiempoUsoArmadura) != 0) {
            System.out.println("u3dañado");

            if (Math.random() < 0.3) {
                i1.getUsoBotas().setDañado(true);
                i1.getUsoGuantes().setDañado(true);
            } else {
                i1.getUsoBotas().setDañado(false);
                i1.getUsoGuantes().setDañado(false);
            }

        }
        if (i1.dispararGuantes(tiempoUsoArmadura) != 0) {
            System.out.println("u2dañado");

            if (Math.random() < 0.3) {
                i1.getUsoGuantes().setDañado(true);
            } else {
                i1.getUsoGuantes().setDañado(false);
            }
        }
        if (i1.escribirConsola() != 0) {
            System.out.println("u1dañado");

            if (Math.random() < 0.3) {
                i1.getUsoConsola().setDañado(true);
            } else {
                i1.getUsoConsola().setDañado(false);
            }
        }
        if (i1.hablarSintetizador() != 0) {
            if (Math.random() < 0.3) {
                i1.getUsoSintetizador().setDañado(true);
            } else {
                i1.getUsoSintetizador().setDañado(false);

            }

        }
    }
//    Hay veces que se puede reparar los daños de un dispositivo, en general es el 40% de las
//veces que se puede hacer. Utilizar la clase Random para modelar este comportamiento.
//En caso de estar dentro de la probabilidad (es decir probabilidad menor o igual al 40%)
//marcar el dispositivo como sano. Si no dejarlo dañado.

    public void repararDañoBota() {
        if (i1.getUsoBotas().isDañado() == true) {

            if (Math.random() < 0.4) {
                i1.getUsoBotas().setDañado(false);
            }
        }
    }

    public void repararDañoConsola() {
        if (i1.getUsoConsola().isDañado() == true) {

            if (Math.random() < 0.4) {
                i1.getUsoConsola().setDañado(false);
            }
        }
    }

    public void repararDañoGuantes() {
        if (i1.getUsoGuantes().isDañado() == true) {

            if (Math.random() < 0.4) {
                i1.getUsoGuantes().setDañado(false);
            }
        }
    }

    public void repararDañoSintetizador() {
        if (i1.getUsoSintetizador().isDañado() == true) {

            if (Math.random() < 0.4) {
                i1.getUsoSintetizador().setDañado(false);
            }
        }
    }
//    Los dispositivos son revisados por JARVIS para ver si se encuentran dañados. En caso
//de encontrar un dispositivo dañado se debe intentar arreglarlo de manera insistente. Para
//esos intentos hay un 30% de posibilidades de que el dispositivo quede destruido, pero
//se deberá intentar arreglarlo hasta que lo repare, o bien hasta que quede destruido.
//Hacer un método llamado revisar dispositivos que efectúe lo anteriormente descrito, el
//mecanismo insistente debe efectuarlo con un bucle do while.

    public void reparacionesBotas() {
        if (i1.getUsoBotas().isDañado() == true) {
            if (Math.random() < 0.3) {

                do {

                    repararDañoBota();

                } while (i1.getUsoBotas().isDañado() == true);

            } else {

                i1.getUsoBotas().setDañado(true);

                System.out.println("Las " + i1.getUsoBotas().getNombre() + " han quedado dañadas definitivamente");

            }
        }
    }

    public void reparacionesGuante() {
        if (i1.getUsoGuantes().isDañado() == true) {
            if (Math.random() < 0.3) {

                do {

                    repararDañoGuantes();

                } while (i1.getUsoBotas().isDañado() == true);

            } else {

                i1.getUsoGuantes().setDañado(true);

                System.out.println("Los " + i1.getUsoGuantes().getNombre() + " a quedado dañado definitivamente");

            }
        }
    }

    public void reparacionesConsola() {
        if (i1.getUsoConsola().isDañado() == true) {
            if (Math.random() < 0.3) {

                do {

                    repararDañoConsola();

                } while (i1.getUsoConsola().isDañado() == true);

            } else {

                i1.getUsoConsola().setDañado(true);

                System.out.println("La " + i1.getUsoConsola().getNombre() + " a quedado dañada definitivamente");

            }
        }
    }

    public void reparacionesSintetizador() {
        if (i1.getUsoSintetizador().isDañado() == true) {
            if (Math.random() < 0.3) {

                do {

                    repararDañoSintetizador();

                } while (i1.getUsoSintetizador().isDañado() == true);

            } else {

                i1.getUsoSintetizador().setDañado(true);

                System.out.println("El" + i1.getUsoSintetizador().getNombre() + " a quedado dañado definitivamente");

            }
        }
    }

    public void crearRadar() {//genero una matriz multidimensional, y ubico la armadura en el punto_(0.0.0)

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                for (int k = 0; k < 11; k++) {
                    if (i == 0 && j == 0 && k == 0) {//coloco a iron man en la posicion 0.0.0 (le doy el valor de 0)
                        radar[i][j][k] = i1.getNombre();//i numero de matriz, j numero de fila, k numero de columna

                    } else {
                        radar[i][j][k] = null;
                    }
                }
            }
        }
        agregarObjetos();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                for (int k = 0; k < 11; k++) {
                    System.out.print(" | " + radar[i][j][k]);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }

    }
//    protected String nombre;
//    protected Float resistencia;
//    protected Float hostilidad;
//    protected boolean hostil;
//Hacer un método en JARVIS que agregue en radar objetos, hacer que la resistencia, las
//coordenadas y la hostilidad sean aleatorios utilizando la clase random. Utilizar la clase
//Random.

    public void agregarObjetos() {
        //creo distintos elementos que se van a agregar a el radar en ubicaciones aleatorias

        ObjetosVarios o1 = new ObjetosVarios("tanque", (float) (Math.random() * 50000), (float) (Math.random() * 50000), true);
        ObjetosVarios o2 = new ObjetosVarios("avion", (float) (Math.random() * 50000), (float) (Math.random() * 50000), true);
        ObjetosVarios o3 = new ObjetosVarios("armadura", (float) (Math.random() * 50000), (float) (Math.random() * 50000), false);
        ObjetosVarios o4 = new ObjetosVarios("hulk", (float) (Math.random() * 50000), (float) (Math.random() * 50000), true);
        ObjetosVarios o5 = new ObjetosVarios("barco", (float) (Math.random() * 50000), (float) (Math.random() * 50000), false);
        ObjetosVarios o6 = new ObjetosVarios("auto", (float) (Math.random() * 50000), (float) (Math.random() * 50000), true);
        ObjetosVarios o7 = new ObjetosVarios("malo", (float) (Math.random() * 50000), (float) (Math.random() * 50000), true);
        ObjetosVarios o8 = new ObjetosVarios("spidey", (float) (Math.random() * 50000), (float) (Math.random() * 50000), true);
        ObjetosVarios o9 = new ObjetosVarios("F16", (float) (Math.random() * 50000), (float) (Math.random() * 50000), true);
        ObjetosVarios o10 = new ObjetosVarios("moto", (float) (Math.random() * 50000), (float) (Math.random() * 50000), true);
        varios.add(o1);
        varios.add(o2);
        varios.add(o3);
        varios.add(o4);
        varios.add(o5);
        varios.add(o6);
        varios.add(o7);
        varios.add(o8);
        varios.add(o9);
        varios.add(o10);
        //recorro la lista de varios y voy a agregando todos sus elementos en ubicaciones aleatorias

        for (ObjetosVarios aux : varios) {

            radar[(int) (Math.random() * 10)][(int) (Math.random() * 10)][(int) (Math.random() * 10)] = aux;

        }
        //para ver atributos de los elementos agregados al radar
//        for (ObjetosVarios vario : varios) {
//            System.out.println(""+vario.getHostilidad()+" resistencia "+vario.getResistencia());
//        }

    }
//    Desarrollar un método para que JARVIS que analice todos los objetos del radar y si son
//hostiles que les dispare. El alcance de los guantes es de 5000 metros, si el objeto se
//encuentra fuera de ese rango no dispara.
//JARVIS al detectar un enemigo lo atacará hasta destruirlo, la potencia del disparo es
//inversamente proporcional a la distancia al a que se encuentra el enemigo y se
//descontará de la resistencia del enemigo. El enemigo se considera destruido si su
//resistencia es menor o igual a cero.
//JARVIS solo podrá disparar si el dispositivo está sano y si su nivel de batería lo permite.
//Si tiene los dos guantes sanos podrá disparar con ambos guantes haciendo más daño.
//Resolver utilizando un for each para recorrer el arreglo y un while para destruir al enemigo.

    public void destruyendoEnemigos() {
        for (int i = 0; i < 10; i++) {//suponiendo q la distancia entre ptos es 1 metro calculo la distancia de los objetivos
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (radar[i][j][k] != null && radar[i][j][k] != i1.getNombre()) {//recorro y si es distinto de null muestro la distancia a la que se encuentra el objetivo
                        System.out.println("La distancia al objetivo " + varios.get(i).getNombre() + " es de: " + ((i + j + k) * 1000) + " mts");
                        //si la distancia es menor a 5mil y los guantes no estan dañados y el objetivo es hostil procedo a disparar
                        if (((i + j + k) * 1000) <= 5000 && i1.getUsoGuantes().isDañado() == false
                                && varios.get(i).isHostil() == true
                                && i1.getNivelReactor() > varios.get(i).getResistencia()) {
                            //si la distancia es menor q 5 mil metros
                            //si el nivel del reactor es mayor q el de la resistencia
                            //si el objetivo es hostil
                            //le resto al nivel del reactor lo q consume al disparar, el tiempo lo calculo dividiendo la resistencia del objeto en el consumo q tiene por segundos el guante
                            //y a su vez le resto los metros q hay entre iron man y el objetivo
                            System.out.println("1-Nivel del reactor antes de disparar: " + i1.getNivelReactor());

                            System.out.println("2-Nivel de resistencia del objetivo: " + varios.get(i).getResistencia());

                            System.out.println("3-Nivel de gasto por segundos del guante: " + i1.getUsoGuantes().getConsumo());

                            System.out.println("4-Consumo debido a la distancia del objetivo: " + ((i + j + k) * 1000));

                            Float segundosNecesarios = varios.get(i).getResistencia() / i1.getUsoGuantes().getConsumo();

                            System.out.println("Consumo al disparar: " + i1.dispararGuantes(segundosNecesarios) + ((i + j + k) * 1000));

                            i1.setNivelReactor(i1.getNivelReactor() - (i1.dispararGuantes(segundosNecesarios) + (i + j + k) * 1000));

                            informeBateria();

                            varios.get(i).setResistencia(0f);
                        }
                    }
                }
            }
        }
    }
}