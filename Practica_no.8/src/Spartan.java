public class Spartan {

    public String nombre;
    int salud;
    int escudo;
    String armaPrincipal;


    //Metodos del Spartan

    public void mostarInfo(){
        System.out.println("---------- Información del Spartan ---------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Escudo: " + escudo);
        System.out.println("Arma Principal: " + armaPrincipal);
        System.out.println("--------------------------------------------");

    }

    public void atacar(String enemigo){
        System.out.println(nombre + "atacar a " + enemigo + " con " + armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restante = 10;
        int total = restante + municiones;
        System.out.println("El arma " + armaPrincipal + " tiene " + total + " balas");
    }

    public void correr(Boolean status){
        if(status){
            System.out.println("El Spartan " + nombre + " esta corriendo ");
        }else{
            System.out.println("El Spartan " + nombre + " se detuvo ");
        }

    }
}
