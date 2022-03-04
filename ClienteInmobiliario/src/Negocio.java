public abstract class Negocio extends Propiedad {

    int numeroOficinas;
    boolean cocina;

    public int getNumeroOficinas() {

        return numeroOficinas;

    }

    public void setNumeroOficinas(int numeroOficinas) {

        this.numeroOficinas = numeroOficinas;

    }

    public boolean isCocina() {

        return cocina;

    }

    public void setCocina(boolean cocina) {

        this.cocina = cocina;
        
    }
    
}
