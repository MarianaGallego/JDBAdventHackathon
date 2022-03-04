import java.util.Scanner;

public class CasaFinca extends Vivienda {

    Scanner cf = new Scanner(System.in);

    public CasaFinca () {

        crearCasaFinca();

    }

    public void cambiarPrecio() {
        
    }

    public void agregarImagenes() { 

    }

    public void crearCasaFinca() {

        System.out.println("\nUsted va a agregar una nueva CASA FINCA, por favor digite los siguientes datos:");
        System.out.println("\nCodigo: ");
        codigo = cf.nextLine();
        System.out.println("Direccion: ");
        direccion = cf.nextLine();
        System.out.println("Propietario: ");
        propietario = cf.nextLine();
        System.out.println("Numero de contacto: ");
        numeroContacto = cf.nextLine();
        System.out.println("Area de la propiedad: ");
        area = Double.parseDouble(cf.nextLine());
        System.out.println("Precio: ");
        precio = Double.parseDouble(cf.nextLine());
        System.out.println("Numero de habitaciones: ");
        numeroHabitaciones = Integer.parseInt(cf.nextLine());
        System.out.println("Numero de baños: ");
        numeroBanos = Integer.parseInt(cf.nextLine());
        System.out.println("Parqueadero true/false");
        parqueadero = Boolean.parseBoolean(cf.nextLine());

    }
    
}
