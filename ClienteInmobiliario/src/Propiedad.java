public abstract class Propiedad {

    //Datos básicos
    String codigo;
    String direccion;
    String propietario;
    String numeroContacto;
    double area;
    double precio;

    //Detalles
    int numeroBanos;
    boolean parqueadero;

    

    public String getCodigo() {
        return codigo;
    }

    public void cambiarPrecio() {
        
    }

    public void agregarImagenes() { 

    }

    public String getDireccion() {
        return direccion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public boolean isParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(boolean parqueadero) {
        this.parqueadero = parqueadero;
    }

    
    
}
