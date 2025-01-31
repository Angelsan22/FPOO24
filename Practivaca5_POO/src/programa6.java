import java.util.*;

public class programa6 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int saldo = 0;

        System.out.print("Ingrese la cantidad total a depositar: ");
        int deposito = sc.nextInt();
        saldo += deposito;

        System.out.print("Ingrese la cantidad total a retirar: ");
        int retiro = sc.nextInt();

        if (retiro > saldo) {
            System.out.println("No tienes suficiente saldo para retirar esa cantidad.");
        } else {
            saldo -= retiro;
        }

        sc.close();
        System.out.println("\nSaldo final: " + saldo);
        
    }
}
