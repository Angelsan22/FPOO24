import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        veiculo ve = new veiculo(" ", " ", " ");
        conductores cond = new conductores("", "", 0);


        String[] opciones = {"Ingresar un veiculo", "Ingresar un conductor", "ingrese un envio", "Actualize el envio", "Informacion", "Salir"};
        while(true) {
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (opcion == null || opcion.equals("Salir")) {
                break;
            }

            switch (opcion) {
                case "Ingresar un veiculo":
                    ve.veiculo();
                    break;

                case "Ingresar un conductor":
                    cond.conductor();
                    break;
                case "Ingresar un envio":
                    break;
            }

        }

    }
}