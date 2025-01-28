import java.util.Scanner;

public class programa5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Ingresa un operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            default:
                System.out.println("Error: Operador no válido. Intenta de nuevo.");
                break;
        }

        sc.close();
    }
}
