import javax.swing.*;

public class conductores {

    private String nombre;
    private String identificacion;
    private int licencia;

    public void conductor() {

        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del conductor: ");

        identificacion = JOptionPane.showInputDialog(null, "Ingrese el identificacion del conductor: ");

        licencia = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la licencia del conductor: "));

    }

    public String getInfo() {
        return "Conductor:\nNombre: " + nombre + "\nIdentificación: " + identificacion + "\nLicencia: " + licencia + "\n";
    }


    public conductores(String nombre, String identificacion, int licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

}
