
public class Venta {
    private String vendedor, cliente, carroVend;
    
    private double costoTrans;
    

    public Venta(double costoTrans, String cliente, String vendedor, String carroVend) {
        this.costoTrans = costoTrans;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.carroVend = carroVend;
    }

    public Venta(double costoTrans) {
        this.costoTrans = costoTrans;
    }
    

    public Venta() {
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCarroVend() {
        return carroVend;
    }

    public void setCarroVend(String carroVend) {
        this.carroVend = carroVend;
    }

    public double getCostoTrans() {
        return costoTrans;
    }

    public void setCostoTrans(double costoTrans) {
        this.costoTrans = costoTrans;
    }

   

    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", cliente=" + cliente + ", costoTrans=" + costoTrans + ", carroVend=" + carroVend + '}';
    }
    
    
    
}
