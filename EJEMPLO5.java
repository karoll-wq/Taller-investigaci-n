import java.util.ArrayList;
import java.util.Scanner;
public class EJEMPLO5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();
        System.out.print("¿Cuántas ciudades desea ingresar?: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ciudad: ");
            ciudades.add(entrada.nextLine());
        }
        // ================= FORMA TRADICIONAL =================
        /*
        String[] arreglo = ciudades.toArray(new String[ciudades.size()]);
        */
        // ================= FORMA ABREVIADA =================
        String[] arreglo = ciudades.toArray(String[]::new);
        System.out.println("Ciudades:");
        for (String ciudad : arreglo) {
            System.out.println(ciudad);
        }
        entrada.close();
    }
}
