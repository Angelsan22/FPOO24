import java.util.Scanner;

public class programa4 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del triángulo: ");
        int altura = sc.nextInt();
        sc.close();

        for (int i = 1; i <= altura; i += 2) {
            for (int j = i; j >= 1; j -= 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
