/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author Ivan Ocadiz
 * Clase que construye coches
 */
public class Coche {
    private String color;
    private String marca;
    private String placa;

    
    
    /**
     * Constructor vacio
     */
    public Coche(){
        
    }
    /**
     * Constructor lleno
     * @param color El color del coche
     * @param marca La marca del coche
     * @param placa Placa vehicular
     */
    public Coche(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }
    /**
     * Metodo que devuelve el color
     * @return Color del coche
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo que establece el color 
     * @param color Color del coche
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Metodo que devuelve la marca
     * @return Marca del coche
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo que establece la marca
     * @param marca Marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Metodo que devuelve la placa vehicular
     * @return Placa vehicular
     */
    public String getPlaca() {
        return placa;
    }
    /**
     * Metodo que establece la placa vehicular
     * @param placa 
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Metodo que acelera el coche
     */
    public void acelerar(){
        System.out.println("Estoy acelerando");
    }
    /**
     * Metodo que carga el coche
     * @param cosa la carga del coche
     * @return lo que el coche está cargando
     */
    public String carga(String cosa){
        System.out.println("Estoy caragando "+ cosa);
        return cosa;
    }
    /**
     * Metodo que parsea un objeto a una cadena
     * @return los atributos del objeto en cadena
     */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
    } 
}
