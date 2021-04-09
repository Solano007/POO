
import java.util.Scanner;

public class practica5 {

    static Scanner teclado = new Scanner(System.in);

    public static int main(String[] args) {

        float arreglo[] = new float[10];
        int posicionDeElementoBuscado;
        posicionDeElementoBuscado = existeenelarreglo(arreglo);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa los numeros ");
            arreglo[i] = Integer.parseInt(teclado.nextLine());
        }
        System.out.println("¿Que numero deseas buscar: ");
        
        for (int x = 0; x < arreglo.length; x++) {
            float busqueda = 0;
            if (arreglo[x] == busqueda) {
                return x;
            }
        }
        return -1;

        if (posicionDeElementoBuscado == -1) {
            System.out.println("El elemento NO existe en el arreglo");
        } else {
            System.out.println("El elemento existe en la posición: " + posicionDeElementoBuscado);
        }
        return (0);

    }

    private static int existeEnArreglo(float[] arreglo) {
        int posicionDeElementoBuscado = 0;
        return (posicionDeElementoBuscado);

    }

    private static int existeenelarreglo(float[] arreglo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
