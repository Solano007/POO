
import java.util.Scanner;

public class practica5 {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    
    int num = 0;
    int poc[] = new int[10];
    int x = 0;
    boolean Esta = false;
    
    
    for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca los números: ");
            poc[i] = Integer.parseInt(sc.nextLine());

        }
        
        
        System.out.print("¿Qué número desea buscar? ");
        int numero;
        numero=sc.nextInt();

        for(x=0;x<poc.length;x++){
            if (numero == poc[x]) {
                System.out.println("El índice del valor '"+numero+"' es: "+(x));
                Esta = true;
            }
        }

        if(Esta ==false) {
            System.out.println("-1");
        }
        
    }
    
}
