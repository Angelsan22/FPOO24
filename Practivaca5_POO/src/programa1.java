import java.util.*;

public class programa1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de * de la base (número impar): ");
        int base = sc.nextInt();
        sc.close();

        if (base % 2 == 0) {
            System.out.println("La base debe ser un número impar.");
            return;
        }

        int espacios = base / 2;
        int estrellas = 1;

        while (estrellas <= base) {

            int i = 0;
            while (i < espacios) {
                System.out.print(" ");
                i++;
            }

            int j = 0;
            while (j < estrellas) {
                System.out.print("*");
                j++;
            }

            System.out.println();

            espacios--;
            estrellas += 2;
        }
    }
}
