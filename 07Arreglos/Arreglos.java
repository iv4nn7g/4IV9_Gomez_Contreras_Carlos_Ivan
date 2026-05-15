import java.util.Scanner;
public class Arreglos{
 
public static void main (String [] args){

    Scanner entrada = new Scanner(System.in);
    int j = 0;
    /*
    int arreglo[] = new int[10];
    int valor  = 0;
    for (int j = 0; j < arreglo.length; j++){
        System.out.println("Ingrese un valor para el arreglo: " );
        arreglo[j] = entrada.nextInt();
    }
    for (int i = 0; i < arreglo.length; i ++){
        System.out.println("Vamos a recorrer el arreglo: " + arreglo[i] + valor);
        }
    }
    */
    int matriz[][] = new int [3][3];
    for (int i = 0; i < matriz.length; i++){
        System.out.println(i);
        for (j = 0; j < matriz.length; j++){
            System.out.println(j);
            System.out.println("Ingrese el valor de la fila " + i + " ahora ingrese el valor de la columna " + j);
            matriz[i][j] = entrada.nextInt();
        }
    }
    for (int i = 0; i < matriz.length; i++){
        System.out.println(i);
        for (j = 0; j < matriz.length; j++){
            System.out.println(j);
        }
        System.out.println("Mostrar la matriz: " + i + " " + j);
    }
    }
}