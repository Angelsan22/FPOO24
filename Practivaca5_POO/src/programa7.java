import java.util.Scanner;

public class programa7 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            if(i%2==1){
                System.out.print(i+",");
            }
        }
    }
}
