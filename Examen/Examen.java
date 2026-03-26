package Examen;
import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "", apellidopaterno = "", apellidomaterno = "", fechaNacimiento = "", direccion = "";

        int cuartos = 0;
        int opcion;
        double total = 0;

        do { 
            System.out.println("Menu Principal");
            System.out.println("1. Registrar al cliente");
            System.out.println("2.Tipos de pisos");
            System.out.println("3. Cuartos y pisos");
            System.out.println("4. Comprar");
            System.out.println("Seleccionar un opcion:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Datos del cliente");
                    System.out.println("Nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Apellido Paterno:");
                    apellidopaterno = sc.nextLine();

                    System.out.print("Apellido Materno:");
                    System.out.print("Fecha de nacimiento:");
                    break;
                case 2:
                    System.out.println("Tipos de pisos");
                    System.out.println("1. Porcelanato = 22.35 m2");
                    System.out.println("2.Marmoleado = 34.27 m2");
                    System.out.println("3. Acrilico = 22.94 m2");
                    break;

                case 3:

                if (nombre.equals("") || apellidopaterno.equals("")) {
                    System.out.println("Primero ingresar los datos");
                    break;
                    }

                    do {
                        System.out.print("Cuantos cuartos hay");
                        cuartos = sc.nextInt();
                    }
                    while (cuartos <= 1 || cuartos >= 5);
                    for (int i = 1; i <= cuartos; i++) {
                        System.out.print("Cuarto" + i + "___");

                        System.out.print("Largo:");
                        double largo = sc.nextDouble();

                        System.out.print("Ancho:");
                        double ancho = sc.nextDouble();

                        double area = largo * ancho;

                        System.out.println("Tipo de piso:");
                        System.out.println("1. Porcelanato");
                        System.out.println("2. Marmoleado");
                        System.out.println("3. Acrilico");
                        int tipo = sc.nextInt();
                        double precio = 0;
                        String tipoPiso = "";

                        switch (tipo) {
                            case 1:
                                precio = 22.35;
                                tipoPiso = "Porcelanato";
                                break;
                            case 2:
                                precio = 34.27;
                                tipoPiso = "Marmoleado";
                                break;
                            case 3:
                                precio = 22.94;
                                tipoPiso = "Acrilico";
                                break;
                            default:
                                System.out.println("Piso no valido");
                                continue;
                        }

                        double costo = area * precio;
                        total += costo;
                        System.out.println("Tipo de piso: " + tipoPiso);
                        System.out.println("Costo del cuarto: " + costo);
                    }
                    break;

                case 4:
                    

                if (nombre.equals("") || apellidopaterno.equals("")) {
                        System.out.println("Primero ingresar los datos");
                        break;
                    }
                    
                    if (total == 0) {
                        System.out.println("No se ingreasron los datos de los cuartos");
                        break;
                    }

                    double iva = total * 0.16;
                    double totalPagar = total + iva;

                    System.out.println("Resumen");
                    System.out.println("Cliente: " + nombre + " " + apellidopaterno + " " + apellidomaterno);
                    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
                    System.out.println("Direccion: " + direccion);
                    System.out.println("Pago sin IVA: " + total);
                    System.out.println("IVA: " + iva);
                    System.out.println("Total a pagar: " + totalPagar);

                    System.out.println("Seguro de realizar la compra? (s/n)");
                    char confirmacion = sc.next().charAt(0);

                    if (confirmacion == 's' || confirmacion == 'S') {
                        double descuento = totalPagar * 0.0795;
                        double totalFinal = totalPagar - descuento;
                        System.out.println("Descuento" + descuento);
                        System.out.println("Total a pagar" + totalFinal);
                    } else {
                        System.out.println("Compra cancelada");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                        System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
        sc.close();
    }
}