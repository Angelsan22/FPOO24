import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        conversor c = new conversor();

        String[] opciones = {"Arábigo a Romano", "Romano a Arábigo"};
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción", "Conversor Romanos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == 0) {

            String entrada = JOptionPane.showInputDialog("Ingresa un número entre 1 y 50:");
            if (!c.esNumeroValido(entrada)) {
                JOptionPane.showMessageDialog(null, "No es un número válido.");
            } else {
                int num = Integer.parseInt(entrada);
                if (num < 1 || num > 50) {
                    JOptionPane.showMessageDialog(null, "Solo números del 1 al 50.");
                } else {
                    c.setNumero(num);
                    String romano = c.convertirARomano(num);
                    JOptionPane.showMessageDialog(null, "Número romano: " + romano);
                }
            }
        } else if (seleccion == 1) {

            String entrada = JOptionPane.showInputDialog("Ingresa un número romano entre I y L:").toUpperCase();
            int resultado = c.convertirAArabigo(entrada);
            if (resultado == -1) {
                JOptionPane.showMessageDialog(null, "El numero romano no es valido(usa del I al L).");
            } else {
                c.setRomano(entrada);
                JOptionPane.showMessageDialog(null, "Número arábigo: " + resultado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono nada.");
        }
    }
}
