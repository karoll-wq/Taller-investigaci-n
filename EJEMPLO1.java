import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EJEMPLO1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 20);
        edades.put("Carlos", 25);
        System.out.print("Ingrese un nombre: ");
        String nombre = entrada.nextLine();
        // ================= FORMA TRADICIONAL =================
        /*
        int edad;
        if (edades.containsKey(nombre)) {
            edad = edades.get(nombre);
        } else {
            edad = 0;
        }
        */
        // ================= FORMA ABREVIADA =================
        int edad = edades.getOrDefault(nombre, 0);
        System.out.println("Edad: " + edad);
        entrada.close();
    }
}
