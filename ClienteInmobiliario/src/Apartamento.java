import java.util.Scanner;

public class Apartamento extends Vivienda {

    Scanner apto = new Scanner(System.in);

    public Apartamento () {

        crearApartamento();

    }

    public void cambiarPrecio() {
        
    }

    public void agregarImagenes() { 

    }

    public void crearApartamento() {

        System.out.println("\nUsted va a agregar un nuevo APARTAMENTO, por favor digite los siguientes datos:");
        System.out.println("\nCodigo: ");
        codigo = apto.nextLine();
        System.out.println("Direccion: ");
        direccion = apto.nextLine();
        System.out.println("Propietario: ");
        propietario = apto.nextLine();
        System.out.println("Numero de contacto: ");
        numeroContacto = apto.nextLine();
        System.out.println("Area de la propiedad: ");
        area = Double.parseDouble(apto.nextLine());
        System.out.println("Precio: ");
        precio = Double.parseDouble(apto.nextLine());
        System.out.println("Numero de habitaciones: ");
        numeroHabitaciones = Integer.parseInt(apto.nextLine());
        System.out.println("Numero de baños: ");
        numeroBanos = Integer.parseInt(apto.nextLine());
        System.out.println("Parqueadero true/false");
        parqueadero = Boolean.parseBoolean(apto.nextLine());

    }
    
}
