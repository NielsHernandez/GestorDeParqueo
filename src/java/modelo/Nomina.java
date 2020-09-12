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
public class Nomina {
    
    private int numeroNomina;
    private String fecha;
    private double valorTotal;

    public Nomina(int numeroNomina, String fecha, double valorTotal) {
        this.numeroNomina = numeroNomina;
        this.fecha = fecha;
        this.valorTotal = valorTotal;
    }
    
    
    public Nomina(){}

    public int getNumeroNomina() {
        return numeroNomina;
    }

    public void setNumeroNomina(int numeroNomina) {
        this.numeroNomina = numeroNomina;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Nomina{" + "numeroNomina=" + numeroNomina + ", fecha=" + fecha + ", valorTotal=" + valorTotal + '}';
    }
    
    
    
}
