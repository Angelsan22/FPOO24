import javax.swing.*;
import java.security.SecureRandom;

public class password {

    private int longitud;
    private String mayusculas;
    private boolean caractEspeciales;

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIALS = "!@#$%^&*()-_=+<>?";

    public password(int length, String mayusInput, boolean b) {
    }

    public void Password(int longitud, String mayusculas, boolean caractEspeciales){
        this.longitud = longitud;
        this.mayusculas = mayusculas;
        this.caractEspeciales = caractEspeciales;
    }

    public String generarPassword() {
        String charPool = LOWERCASE + NUMBERS;
        if (mayusculas.equalsIgnoreCase("si")) {
            charPool += UPPERCASE;
        }
        if (caractEspeciales) {
            charPool += SPECIALS;
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            password.append(charPool.charAt(random.nextInt(charPool.length())));
        }

        return password.toString();
    }

    public void comprobar(String password) {
        String strength;
        if (password.length() >= 12 && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*()-_=+<>?].*")) {
            strength = "Fuerte";
        } else if (password.length() >= 8) {
            strength = "Moderada";
        } else {
            strength = "Débil";
        }
        JOptionPane.showMessageDialog(null, "Password generado: " + password + "\nFortaleza: " + strength);
    }

}

