import java.util.Scanner;

public class Ejercicio__2_examen {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese en numero entre 200 y 400: ");
        int num = entrada.nextInt();

        if (num >= 200 && num <= 400) {
            for (int i = num; i <= 400; i += 2) {
                System.out.printf("%d \n", i);
            }
        }else if (num < 200 && num > 400) {
            System.out.print("El numero ingresado no se encuentra dentro del rango");
        }
    }
}
