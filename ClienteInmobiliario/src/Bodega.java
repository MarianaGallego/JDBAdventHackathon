import java.util.Scanner;

public class Bodega extends Negocio {

    Scanner b = new Scanner(System.in);


    public Bodega () {

        crearBodega();

    }

    public void cambiarPrecio() {
        
    }

    public void agregarImagenes() { 

    }

    public void crearBodega() {

        System.out.println("\nUsted va a agregar una nueva BODEGA, por favor digite los siguientes datos:");
        System.out.println("\nCodigo: ");
        codigo = b.nextLine();
        System.out.println("Direccion: ");
        direccion = b.nextLine();
        System.out.println("Propietario: ");
        propietario = b.nextLine();
        System.out.println("Numero de contacto: ");
        numeroContacto = b.nextLine();
        System.out.println("Area de la propiedad: ");
        area = Double.parseDouble(b.nextLine());
        System.out.println("Precio: ");
        precio = Double.parseDouble(b.nextLine());
        System.out.println("Numero de oficinas: ");
        numeroOficinas = Integer.parseInt(b.nextLine());
        System.out.println("Numero de baños: ");
        numeroBanos = Integer.parseInt(b.nextLine());
        System.out.println("Cocina true/false");
        cocina = Boolean.parseBoolean(b.nextLine());
        System.out.println("Parqueadero true/false");
        parqueadero = Boolean.parseBoolean(b.nextLine());

    }
    
}
