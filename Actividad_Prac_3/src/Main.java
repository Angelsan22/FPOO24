import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.printf("Ingrese las horas trabajadas: ");
        Double horas = sc.nextDouble();

        System.out.printf("¿Cuanto le pagan por hora?: ");
        Double pago = sc.nextDouble();

        Double Total = horas * pago;

        System.out.printf("La cantidad a cobrar es: " + Total);
    }
}

