import javax.swing.JOptionPane;

public class veiculo {

    private String placa;
    private String modelo;
    private String capasidad_carga;

    public void veiculo() {

        placa = JOptionPane.showInputDialog(null,"Ingrese la placa del veiculo");

        modelo = JOptionPane.showInputDialog(null,"Ingrese el modelo del veiculo");

        capasidad_carga = JOptionPane.showInputDialog(null,"Ingrese la capacidad del veiculo(KG)");

    }

    public String getInfo() {
        return "Vehículo:\nPlaca: " + placa + "\nModelo: " + modelo + "\nCapacidad de carga: " + capasidad_carga + " KG\n";
    }


    public veiculo(String capasidad_carga, String modelo, String placa) {
        this.capasidad_carga = capasidad_carga;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapasidad_carga() {
        return capasidad_carga;
    }

    public void setCapasidad_carga(String capasidad_carga) {
        this.capasidad_carga = capasidad_carga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
