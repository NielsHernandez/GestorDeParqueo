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
public class Vehiculo {
    
    private int numeroPlaca;
    private String Marca;
    private String Color;
    private String tipo;
    
    public Vehiculo() {}

    public int getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(int numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vehiculo(int numeroPlaca, String Marca, String Color, String tipo) {
        this.numeroPlaca = numeroPlaca;
        this.Marca = Marca;
        this.Color = Color;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "numeroPlaca=" + numeroPlaca + ", Marca=" + Marca + ", Color=" + Color + ", tipo=" + tipo + '}';
    }
    
    
}
