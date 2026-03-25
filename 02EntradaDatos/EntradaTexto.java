import java.util.Scanner;

class EntradaTexto {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        System.out.println("Escribe tu nombre: ");
        nombre = System.console().readLine();

        System.out.println("Hola " + nombre + " bienvenido a programar muy feo");
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Tienes " + edad + " años");
        entrada.close();
    }
}