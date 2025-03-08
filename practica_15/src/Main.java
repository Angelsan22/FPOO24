import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {

            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n1. Agregar Empleado\n2. Listar Empleados\n3. Salir");

            if (opcion.equals("1")) {
                String tipoEmpleado = JOptionPane.showInputDialog("Ingrese el tipo de empleado (Conductor/Administrativo):");
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

                if (tipoEmpleado.equalsIgnoreCase("Conductor")) {
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                    empleados.add(new Conductor(nombre, id, salario, licencia));
                } else if (tipoEmpleado.equalsIgnoreCase("Administrativo")) {
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
                    empleados.add(new Administrativo(nombre, id, salario, departamento));
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de empleado no válido.");
                }

            } else if (opcion.equals("2")) {
                if (empleados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                } else {
                    for (Empleado empleado : empleados) {
                        empleado.mostrarInfo();
                    }
                }
            } else if (opcion.equals("3")) {
                continuar = false;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }

    }
}