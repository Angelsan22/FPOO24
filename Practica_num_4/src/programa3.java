import java.util.Scanner;

public class programa3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos años tiene: ");
        int años = sc.nextInt();

        if(años < 4){
            System.out.println("puede entrar gratis");
        } else if (años >= 4 && años <= 17) {
            System.out.println("Precio a pagar: $110");
        } else if (años >= 18) {
            System.out.println("Precio a pagar: $190");
        }
    }
}
