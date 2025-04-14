public class conversor {
    private int numero;
    private String romano;

    public conversor() {
        numero = 0;
        romano = "";
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setRomano(String romano) {
        this.romano = romano;
    }

    public String getRomano() {
        return romano;
    }

    public String convertirARomano(int numero) {
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L"};

        if (numero >= 1 && numero <= 50) {
            return romanos[numero];
        } else {
            return "Número fuera de rango";
        }
    }

    public int convertirAArabigo(String romano) {
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L"};

        for (int i = 1; i <= 50; i++) {
            if (romanos[i].equals(romano)) {
                return i;
            }
        }
        return -1;
    }

    public boolean esNumeroValido(String texto) {
        if (texto == null || texto.isEmpty()) return false;
        for (char c : texto.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
