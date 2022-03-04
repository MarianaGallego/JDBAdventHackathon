import java.util.Scanner;

public class Local extends Negocio {

    Scanner l = new Scanner(System.in);

    public Local () {

        crearLocal();

    }

    public void cambiarPrecio() {
        
    }

    public void agregarImagenes() { 

    }

    public void crearLocal() {

        System.out.println("\nUsted va a agregar una nuevo BODEGA, por favor digite los siguientes datos:");
        System.out.println("\nCodigo: ");
        codigo = l.nextLine();
        System.out.println("Direccion: ");
        direccion = l.nextLine();
        System.out.println("Propietario: ");
        propietario = l.nextLine();
        System.out.println("Numero de contacto: ");
        numeroContacto = l.nextLine();
        System.out.println("Area de la propiedad: ");
        area = Double.parseDouble(l.nextLine());
        System.out.println("Precio: ");
        precio = Double.parseDouble(l.nextLine());
        System.out.println("Numero de oficinas: ");
        numeroOficinas = Integer.parseInt(l.nextLine());
        System.out.println("Numero de baños: ");
        numeroBanos = Integer.parseInt(l.nextLine());
        System.out.println("Cocina true/false");
        cocina = Boolean.parseBoolean(l.nextLine());
        System.out.println("Parqueadero true/false");
        parqueadero = Boolean.parseBoolean(l.nextLine());

    }
    
}
