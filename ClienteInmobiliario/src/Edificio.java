import java.util.Scanner;

public class Edificio extends Negocio {

    Scanner e = new Scanner(System.in);

    int numeroPisos;

    public Edificio () {

        crearEdificio();

    }

    public void cambiarPrecio() {
        
    }

    public void agregarImagenes() { 

    }

    public void crearEdificio() {

        System.out.println("\nUsted va a agregar un nuevo EDIFICIO, por favor digite los siguientes datos:");
        System.out.println("\nCodigo: ");
        codigo = e.nextLine();
        System.out.println("Direccion: ");
        direccion = e.nextLine();
        System.out.println("Propietario: ");
        propietario = e.nextLine();
        System.out.println("Numero de contacto: ");
        numeroContacto = e.nextLine();
        System.out.println("Area de la propiedad: ");
        area = Double.parseDouble(e.nextLine());
        System.out.println("Precio: ");
        precio = Double.parseDouble(e.nextLine());
        System.out.println("Numero de pisos: ");
        numeroPisos = Integer.parseInt(e.nextLine());
        System.out.println("Numero de oficinas: ");
        numeroOficinas = Integer.parseInt(e.nextLine());
        System.out.println("Numero de baños: ");
        numeroBanos = Integer.parseInt(e.nextLine());
        System.out.println("Cocina true/false");
        cocina = Boolean.parseBoolean(e.nextLine());
        System.out.println("Parqueadero true/false");
        parqueadero = Boolean.parseBoolean(e.nextLine());

    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }   
    
}
