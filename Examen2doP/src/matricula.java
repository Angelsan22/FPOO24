import javax.swing.*;
import java.util.Random;

public class matricula {

    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String anoNacimiento;
    private String carrera;

    public void generarMatricula() {
        Random alea = new Random();

       nombre  = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
       apellido_paterno = JOptionPane.showInputDialog(null, "Ingrese su apellido paterno: ");
       apellido_materno = JOptionPane.showInputDialog(null, "Ingrese su apellido materno: ");
       anoNacimiento = (JOptionPane.showInputDialog(null, "Ingrese su año de nacimiento: "));
       carrera = JOptionPane.showInputDialog(null, "Ingrese su carrera: ");


       carrera.length();
        String cad1 = (carrera.substring(0,3));
        String cad3 = ("25");
        String cad4 = (anoNacimiento.substring(2,4));
        String cad5 = (nombre.substring(0,1));
        String cad6 = (apellido_paterno.substring(0,3));
        String cad8 = (apellido_materno.substring(0,3));
        String cad10 = (alea.nextInt(50) + "" + alea.nextInt(50) + alea.nextInt(50));

        JOptionPane.showMessageDialog(null, cad1 +  cad3 + cad4 + cad5 + cad6 + cad8 + cad10);
    }

    public matricula(String nombre, String apellido_paterno, String apellido_materno, String carrera, String anoNacimiento) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.carrera = carrera;
        this.anoNacimiento = anoNacimiento;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(String anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
