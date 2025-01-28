import java.util.Scanner;

public class programa1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String Contraseña="qwerty";
        String cont;


        System.out.println("Ingrese la contraseña: ");
        cont = sc.nextLine();

        if(cont.equals(Contraseña)){
            System.out.println("La contraseña es correcta");
        }else{
            System.out.println("La contraseña es incorrecta");
        }
    }
}
