
import java.util.ArrayList;
import java.util.Scanner;
public class EJEMPLO3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        System.out.print("¿Cuántos nombres desea ingresar?: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre: ");
            nombres.add(entrada.nextLine());
        }
        // ================= FORMA TRADICIONAL =================
        /*
        for (int i = 0; i < nombres.size(); i++) {
            nombres.set(i, nombres.get(i).toUpperCase());
        }
        */
        // ================= FORMA ABREVIADA =================
        nombres.replaceAll(nombre -> nombre.toUpperCase());

        System.out.println(nombres);

        entrada.close();
    }
}
