
import java.awt.Color;
import java.util.Date;


public class Vehiculo {
    private String marca, modelo;
    private Color color;
    private Date year;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Color color, Date year, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
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
