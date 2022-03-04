import java.util.Scanner;

public class Indice {

    Scanner in = new Scanner(System.in);

    int i = 0;

    public void indicePrincipal(Propiedad propiedades[]) {

        String primeraEleccion;

        System.out.println("\nDigite el numero indice de lo que quiere hacer: ");
        System.out.println("\n1. Agregar una nueva propiedad");
        System.out.println("2. Agregar imagenes de una propiedad");
        System.out.println("3. Editar imagenes de una propiedad");
        System.out.println("4. Cambiar precio de una propiedad");
        System.out.println("5. Enlistar propiedades segun un filtro");

        primeraEleccion = in.nextLine();

        switch(primeraEleccion) {

            case "1":
                indiceAgregarPropiedad(propiedades);
                break;
            
            case "2":
                System.out.println("Se eligio la opcion 2");
                break;

            case "4":
                cambiarPrecio(propiedades);

            case "5":
                mostrarArreglo(propiedades);

        }

    }

    public void indiceAgregarPropiedad(Propiedad p[]) {

        String eleccionPropiedad;

        System.out.println("\nDigite el numero indice del tipo de propiedad que quiere agregar: ");
        System.out.println("\n1. Casa");
        System.out.println("2. Casa finca");
        System.out.println("3. Apartamento");
        System.out.println("4. Bodega");
        System.out.println("5. Edificio");
        System.out.println("6. Local");

        eleccionPropiedad = in.nextLine();

        switch(eleccionPropiedad) {

            case "1":
                Casa nuevaCasa = new Casa();
                p[i] = nuevaCasa;
                i++;
                indicePrincipal(p);
                break;

            case "2":
                CasaFinca nuevaCasaFinca = new CasaFinca();
                p[i] = nuevaCasaFinca;
                i++;
                indicePrincipal(p);
                break;

            case "3":
                Apartamento nuevoApartamento = new Apartamento();
                p[i] = nuevoApartamento;
                i++;
                indicePrincipal(p);
                break;

            case "4":
                Bodega nuevaBodega = new Bodega();
                p[i] = nuevaBodega;
                i++;
                indicePrincipal(p);
                break;

            case "5":
                Edificio nuevoEdificio = new Edificio();
                p[i] = nuevoEdificio;
                i++;
                indicePrincipal(p);
                break;

            case "6":
                Local nuevoLocal = new Local();
                p[i] = nuevoLocal;
                i++;
                indicePrincipal(p);
                break;

        }

    }

    public void mostrarArreglo(Propiedad pro[]) {

        System.out.println("\nLISTA DE PROPIEDADES AFILIADAS:");

        for(int i = 0; i < pro.length; i++){

            if(pro[i] != null) {

                System.out.println("\n" + pro[i].getClass().getName() + ": " + "pertenece a " + pro[i].propietario + ", tiene un area de " + pro[i].getArea() + " mts^2" + 
                " y cuesta " + pro[i].getPrecio());
                System.out.println("Contacto: " + pro[i].getNumeroContacto());

            } else {break;}

        }

        indicePrincipal(pro);

    }

    public void cambiarPrecio(Propiedad propi[]) {

        String codigoPropiedad;

        System.out.println("\nUsted va a MODIFICAR el precio de una propiedad:");
        System.out.println("\nDigite el codigo de la propiedad");

        codigoPropiedad = in.nextLine();

        for(int i = 0; i < propi.length ; i++) {

            if(propi[i] != null) {

                if(propi[i].getCodigo() == codigoPropiedad) {

                    System.out.println("\nDigite el nuevo precio de la propiedad:");
                    propi[i].setPrecio(Double.parseDouble(in.nextLine()));
                    indicePrincipal(propi);

                } else {

                    System.out.println("El codigo NO existe");
                    break;

                }

            } else {

                break;

            }

        }

    }
    
}
