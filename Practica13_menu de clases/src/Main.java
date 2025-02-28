import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        veiculo ve = new veiculo(" ", " ", " ");
        conductores cond = new conductores("", "", 0);
        envios env = new envios("", " ", " ");
        entregas ent = new entregas("", " ");


        String[] opciones = {"Ingresar un veiculo", "Ingresar un conductor", "Asignar conductor", "Ingrese un envio", "Estado del envio", "Informacion", "Salir"};
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
                case "Asignar un conductor":
                    break;
                case "Ingrese un envio":
                    env.registros();
                    break;
                case "Estado del envio":
                    ent.entregas();
                    break;
                case "Informacion":
                    JOptionPane.showMessageDialog(null, "Información de todos los registros:\n" +
                    ve.getInfo() + "\n" +
                    cond.getInfo() + "\n" +
                    env.getInfo() + "\n" +
                    ent .getInfo());
                    break;
            }

        }

    }
}