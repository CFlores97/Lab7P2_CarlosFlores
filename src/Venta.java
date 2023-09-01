
public class Venta {
    private Vendedor vendedor = new Vendedor();
    private Cliente cliente = new Cliente();
    private double costoTrans;
    private Vehiculo carroVend = new Vehiculo();

    public Venta(double costoTrans) {
        this.costoTrans = costoTrans;
    }

    public Venta() {
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCostoTrans() {
        return costoTrans;
    }

    public void setCostoTrans(double costoTrans) {
        this.costoTrans = costoTrans;
    }

    public Vehiculo getCarroVend() {
        return carroVend;
    }

    public void setCarroVend(Vehiculo carroVend) {
        this.carroVend = carroVend;
    }

    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", cliente=" + cliente + ", costoTrans=" + costoTrans + ", carroVend=" + carroVend + '}';
    }
    
    
    
}
