/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author niels
 */
public class Nivel {
    
    private int idNivel;
    private int Tarifa;
    private String nombre;
    private int capacidad;
    
    public Nivel(){}

    public Nivel(int idNivel, int Tarifa, String nombre, int capacidad) {
        this.idNivel = idNivel;
        this.Tarifa = Tarifa;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public int getTarifa() {
        return Tarifa;
    }

    public void setTarifa(int Tarifa) {
        this.Tarifa = Tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Nivel{" + "idNivel=" + idNivel + ", Tarifa=" + Tarifa + ", nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }
    
    
    
}
