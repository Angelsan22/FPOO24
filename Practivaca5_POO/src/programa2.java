import java.util.Scanner;

public class programa2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo");
        int num=sc.nextInt();

        for(int i=num;i>=0;i--){
            System.out.print(i+",");
        }
    }
}
