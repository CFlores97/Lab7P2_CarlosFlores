
public class Vendedor {
    private String nombre;
    private int carrosVendidos;
    private double dineroGenerado;

    public Vendedor() {
    }

    public Vendedor(String nombre, int carrosVendidos, double dineroGenerado) {
        this.nombre = nombre;
        this.carrosVendidos = carrosVendidos;
        this.dineroGenerado = dineroGenerado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarrosVendidos() {
        return carrosVendidos;
    }

    public void setCarrosVendidos(int carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }

    public double getDineroGenerado() {
        return dineroGenerado;
    }

    public void setDineroGenerado(double dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
