/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dacastro
 */
public class Ejemplo1 {
    
    private String nombre1;
    private String telefono;

    public Ejemplo1() {
    }

    public Ejemplo1(String nombre1, String telefono) {
        this.nombre1 = nombre1;
        this.telefono = telefono;
    }

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    /**
     * Get the value of nombre1
     *
     * @return the value of nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * Set the value of nombre1
     *
     * @param nombre1 new value of nombre1
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

}
