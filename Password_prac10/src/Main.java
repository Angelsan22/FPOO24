import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String lengthInput = JOptionPane.showInputDialog("Ingresa la longitud del password (8 por default):");
        int length = 8;
        try {
            if (lengthInput != null && !lengthInput.isEmpty()) {
                length = Integer.parseInt(lengthInput);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se usará la longitud por defecto de 8 caracteres.");
        }

        String mayusInput = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?:", "Opciones", JOptionPane.YES_NO_OPTION);
        int includeSpecial = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);

        password passwordObj = new password(length, mayusInput, includeSpecial == JOptionPane.YES_OPTION);
        String password = passwordObj.generarPassword();
        passwordObj.comprobar(password);
    }
}