
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EJEMPLO2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<String, String> usuarios = new HashMap<>();
        System.out.print("Ingrese un usuario: ");
        String usuario = entrada.nextLine();
        // ================= FORMA TRADICIONAL =================
        /*
        if (!usuarios.containsKey(usuario)) {
            usuarios.put(usuario, "Registrado");
        }
        */
        // ================= FORMA ABREVIADA =================
        usuarios.computeIfAbsent(usuario, u -> "Registrado");
        System.out.println(usuarios);
        entrada.close();
    }
}
