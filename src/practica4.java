
import java.util.Scanner;

public class practica4 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        float suma = 0;
        float numeros[] = new float[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número  " );
            numeros[i] = Integer.parseInt(teclado.nextLine());

        }
        for (int x = 0; x < numeros.length; x++) {
            suma = suma + numeros[x];

        }
        float promedio = suma / numeros.length;
        System.out.printf(" El promedio es: %f", promedio);
    }
}
