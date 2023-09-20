/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

//@author rembe
 
public class Armadura {

    protected String nombre = "Iron man";
    protected Integer nivelSalud;
    protected Float nivelReactor;
    protected Botas botas1;
    protected Guantes guantes1;
    protected Consola consola1;
    protected Sintetizador sintetizador1;

    public Armadura() {
        this.nivelSalud = 100;
        this.nivelReactor = Float.MAX_VALUE;
        this.botas1 = new Botas("Botas", false, 20000);
        this.guantes1 = new Guantes("Guantes", false, 15000);
        this.consola1 = new Consola("Consola", false, 8000);
        this.sintetizador1 = new Sintetizador("Sintetizador", false, 5000);
    }

//    public Armadura(Integer nivelSalud, Float nivelReactor, Botas usoBotas, Guantes usoGuantes, Consola usoConsola, Sintetizador usoSintetizador) {
//        this.nivelSalud = 100;
//        this.nivelReactor = Float.MAX_VALUE;
//        this.botas1 = new Botas("Botas", false, 20000);
//        this.guantes1 = new Guantes("Guantes", false, 15000);
//        this.consola1 = new Consola("Consola", false, 8000);
//        this.sintetizador1 = new Sintetizador("Sintetizador", false, 5000);
//    }

    public Integer getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(Integer nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Float getNivelReactor() {
        return nivelReactor;
    }

    public void setNivelReactor(Float nivelReactor) {
        this.nivelReactor = nivelReactor;
    }

    public Botas getUsoBotas() {
        return botas1;
    }

    public void setUsoBotas(Botas usoBotas) {
        this.botas1 = usoBotas;
    }

    public Guantes getUsoGuantes() {
        return guantes1;
    }

    public void setUsoGuantes(Guantes usoGuantes) {
        this.guantes1 = usoGuantes;
    }

    public Consola getUsoConsola() {
        return consola1;
    }

    public void setUsoConsola(Consola usoConsola) {
        this.consola1 = usoConsola;
    }

    public Sintetizador getUsoSintetizador() {
        return sintetizador1;
    }

    public void setUsoSintetizador(Sintetizador usoSintetizador) {
        this.sintetizador1 = usoSintetizador;
    }

//• Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
//establecida como consumo en la bota por el tiempo en el que se camine.
    public Float caminar(Float tiempoMinutos) {

        Float energiaConsumida = (botas1.getConsumo() * tiempoMinutos);

        return energiaConsumida;

    }
//    • Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
//energía establecida como consumo en la bota por el tiempo en el que se corra.

    public Float correr(Float tiempoSegundos) {
//100-1
        Float energiaConsumida = ((botas1.getConsumo() * tiempoSegundos) * 2);

        return energiaConsumida;
    }
//    • Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
//energía por el tiempo que dure la propulsión.
//botas consumen 20000x segundo

    public Float propulsarse(Float tiempoSegundos) {

        Float energiaConsumida = ((botas1.getConsumo() * tiempoSegundos) * 3);

        return energiaConsumida;

    }
//    Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
//consumiendo el triple de la energía establecida para las botas y el doble para los
//guantes.

    public Float volar(Float tiempoSegundos) {
        Float energiaConsumida = (((botas1.getConsumo() * tiempoSegundos) * 3) + ((guantes1.getConsumo() * tiempoSegundos) * 2));

        return energiaConsumida;
    }
//    Al utilizar los guantes como armas el consumo se triplica durante el tiempo del
//disparo.

    public Float dispararGuantes(Float tiempoSegundos) {
        Float energiaConsumida = ((guantes1.getConsumo() * tiempoSegundos) * 3);

        return energiaConsumida;
    }
//    Cada vez que se escribe en la consola o se habla a través del sintetizador se consume
//lo establecido en estos dispositivos. Solo se usa en nivel básico.

    public Float escribirConsola() {

        Float energiaConsumida = (float) (consola1.getConsumo());

        return energiaConsumida;
    }

    public Float hablarSintetizador() {

        Float energiaConsumida = (float) sintetizador1.getConsumo();

        return energiaConsumida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Armadura: " + "\n-Nivel Salud= " + nivelSalud
                + "\n-Carga Reactor= " + nivelReactor
                + "\n-Consumo Botas= " + botas1.getConsumo()
                + "\n-Consumo Guantes= " + guantes1.getConsumo()
                + "\n-Consummo Consola= " + consola1.getConsumo()
                + "\n-Consumo Sintetizador= " + sintetizador1.getConsumo();
    }

}