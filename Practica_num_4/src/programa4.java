import java.util.Scanner;

public class programa4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la frase o palabra: ");
        String frase = sc.nextLine();

        String palabraInvertida = new StringBuilder(frase).reverse().toString();
        if (frase.equalsIgnoreCase(palabraInvertida)) {
            System.out.println("La palabra: " + palabraInvertida + " es palíndromo");
        }else {
            System.out.println("La palabra: " + palabraInvertida + " no es palíndromo");
        }
    }
}
