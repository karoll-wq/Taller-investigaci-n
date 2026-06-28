import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EJEMPLO4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<>();
        System.out.print("¿Cuántas frutas desea ingresar?: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Fruta: ");
            frutas.add(entrada.nextLine());
        }
        // ================= FORMA TRADICIONAL =================
        /*
        List<String> copia = new ArrayList<>(frutas);
        */
        // ================= FORMA ABREVIADA =================
        List<String> copia = List.copyOf(frutas);
        System.out.println(copia);
        entrada.close();
    }
}

