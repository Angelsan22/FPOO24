import javax.swing.*;

public class entregas {

    private String numero_guia;
    private String estado;
    String estad = "Pendiente";

    public void entregas() {

    numero_guia = JOptionPane.showInputDialog(null, "Ingrese el numero de guia: ");

    JOptionPane.showMessageDialog(null, "El numero de guia del paquete es: " + numero_guia + "\n" + "El estado del paquete es : " + estad);

        String[] opciones = {"No", "Si"};
        while(true) {
            String opcion = (String) JOptionPane.showInputDialog(null, "Desea modificar el estado del paquete?", "Menu", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            if (opcion == null || opcion.equals("No")) {
                break;
            }

            String[] estados = {"En tránsito", "Entregado"};
            String nuevoEstado = (String) JOptionPane.showInputDialog(null, "Seleccione el nuevo estado:","Cambio de Estado", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0]);

            if (nuevoEstado != null) {
                estad = nuevoEstado;
                JOptionPane.showMessageDialog(null, "El estado del paquete ahora es: " + estad);
            }


        }

    }

    public String getInfo() {
        return "Entrega:\nNúmero de guía: " + numero_guia + "\nEstado: " + estad + "\n";
    }

    public entregas(String numero_guia, String estado) {
        this.numero_guia = numero_guia;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero_guia() {
        return numero_guia;
    }

    public void setNumero_guia(String numero_guia) {
        this.numero_guia = numero_guia;
    }

}
