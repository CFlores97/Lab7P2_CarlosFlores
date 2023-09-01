
public class Cliente {
    private String nombre, profesion;
    private int edad, carrosComprados;
    private double sueldoDisp;

    public Cliente() {
    }

    public Cliente(String nombre, String profesion, int edad, int carrosComprados, double sueldoDisp) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;
        this.carrosComprados = carrosComprados;
        this.sueldoDisp = sueldoDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarrosComprados() {
        return carrosComprados;
    }

    public void setCarrosComprados(int carrosComprados) {
        this.carrosComprados = carrosComprados;
    }

    public double getSueldoDisp() {
        return sueldoDisp;
    }

    public void setSueldoDisp(double sueldoDisp) {
        this.sueldoDisp = sueldoDisp;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
