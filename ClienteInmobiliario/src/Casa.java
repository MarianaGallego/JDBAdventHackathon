import java.util.Scanner;

public class Casa extends Vivienda {

    Scanner c = new Scanner(System.in);

    public Casa () {

        crearCasa();

    }

    public void cambiarPrecio(Propiedad propiedad) {
        
        System.out.println("Digite el nuevo precio:");

    }

    public void agregarImagenes() { 

    }

    public void crearCasa() {

        System.out.println("\nUsted va a agregar una nueva CASA, por favor digite los siguientes datos:");
        System.out.println("\nCodigo: ");
        codigo = c.nextLine();
        System.out.println("Direccion: ");
        direccion = c.nextLine();
        System.out.println("Propietario: ");
        propietario = c.nextLine();
        System.out.println("Numero de contacto: ");
        numeroContacto = c.nextLine();
        System.out.println("Area de la propiedad: ");
        area = Double.parseDouble(c.nextLine());
        System.out.println("Precio: ");
        precio = Double.parseDouble(c.nextLine());
        System.out.println("Numero de habitaciones: ");
        numeroHabitaciones = Integer.parseInt(c.nextLine());
        System.out.println("Numero de baños: ");
        numeroBanos = Integer.parseInt(c.nextLine());
        System.out.println("Parqueadero true/false");
        parqueadero = Boolean.parseBoolean(c.nextLine());

    }
    
}
