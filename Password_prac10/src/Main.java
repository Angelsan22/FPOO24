import javax.swing.*;
import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Angel Sanchez");
        int largo;
        String caracterEspecial;
        String mayusculas;
        String opc;
        String password;

        password pas = new password(8, "°!#$%&/()=?¡'¿´+¨*{}[]^`,.-;:_", "QWERTYUIOPASDFGHJKLÑZXCVBNM", " " );

        do {

            opc= JOptionPane.showInputDialog("1 para continuar, 2 para verificar, 3 para salir");
            if (opc.equals("1")) {
                largo=Integer.parseInt(JOptionPane.showInputDialog("ingresa el tamaño de la contraseña"));
                pas.verificarlargo(largo);

                caracterEspecial=JOptionPane.showInputDialog("ingrese el caracter especial que desea que contenga su contraseña");
                pas.verificarcaracteresespeciales(caracterEspecial);

                mayusculas=JOptionPane.showInputDialog("ingrese la letra mayuscula que desea que contenga");
                pas.verificarmayusculas(mayusculas);

                password = pas.generarPassword(largo,caracterEspecial,mayusculas);
                JOptionPane.showMessageDialog(null, password);

            }else if(opc.equals("2")) {
                password=JOptionPane.showInputDialog("ingresa la contraseña:");
                pas.verificarseguridad(password);
            }

        }while (!opc.equals("3"));

        JOptionPane.showMessageDialog(null,"saliendo");

    }
}