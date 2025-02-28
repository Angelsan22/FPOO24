import java.util.*;
import javax.swing.*;

public class envios {

    private String codigo_envio;
    private String destino;
    private String peso;

    public void registros() {

        codigo_envio = JOptionPane.showInputDialog(null, "Cual es el codigo de envio: ");
        destino = JOptionPane.showInputDialog(null, "Cual es el destino: ");
        peso = JOptionPane.showInputDialog(null, "Cual es el peso del paquete(KG): ");

        String[] opciones = {"Codigo y destino", "codigo destino y peso", "Salir"};

        while (true) {
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (opcion == null || opcion.equals("Salir")) {
                break;
            }

            switch (opcion) {

                case "Codigo y destino":
                    JOptionPane.showMessageDialog(null, "El codigo de envio es: " + codigo_envio + "\n" + "El destino es: " + destino);
                    break;
                case "codigo destino y peso":
                    JOptionPane.showMessageDialog(null, "El codigo de envio es: " + codigo_envio + "\n" + "El destino es: " + destino + "\n" + "El peso del paquete es: " + peso + " KG");
                    break;
            }
        }

    }

    public String getInfo() {
        return "    Envío:\nCódigo: " + codigo_envio + "\nDestino: " + destino + "\nPeso: " + peso + " KG\n";
    }

    public envios(String codigo_envio, String destino, String peso) {
        this.codigo_envio = codigo_envio;
        this.destino = destino;
        this.peso = peso;
    }

    public String getCodigo_envio() {
        return codigo_envio;
    }

    public void setCodigo_envio(String codigo_envio) {
        this.codigo_envio = codigo_envio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

}