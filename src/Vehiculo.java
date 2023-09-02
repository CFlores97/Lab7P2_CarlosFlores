
import java.awt.Color;
import java.util.Date;


public class Vehiculo {
    private String marca, modelo;
    private String color;
    private String year;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, String year, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.year = year;
        this.precio = precio;
    }

    public Vehiculo(String marca, String modelo, String year, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return marca;
        
    }
    
    
    
}
