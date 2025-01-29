import java.util.Scanner;

public class programa3 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un del 1 al 10: ");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++){
            if(num<1 && num>10){
                System.out.println("El numero "+num+" no se encuentra dentro del rango.");
            }else if(num>1 && num<10){
                System.out.println(num + "x" + i + " = " + num*i);
            }
        }


    }
}
