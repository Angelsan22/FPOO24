//IMPORTACIONES
//import java.util.Random;
import java.util.Scanner;


//Clase principal
public class Main {

    //Metodo main (Metodo principal)
    public static void main(String[] args) {


//    2. estructura de cadenas y selecciones de sierta cantidad de datos.
//        System.out.printf("Hello, José Ángel sanchez ");
//        String cadenas = "Angel " + "Sánchez " + "Linares ";
//
//        System.out.print(cadenas);
//
//        System.out.println(cadenas.length());
//
//        System.out.println(cadenas.substring(2,5));
//        System.out.println(cadenas.substring(2));
//        System.out.println(cadenas.substring(0,5));


//      3 variables

//        int x=5,x2;
//        double y=1.25,y2;
//        String z="204",z1;
//
//        //Conversion de cadena a int
//        x2= Integer.parseInt(z);
//
//        //conversion de double a cadena
//        z1= String.valueOf(y);
//
//        //Conversion de int a double
//        Double asd= Double.valueOf(x);
//
//
//        //Conversion Implicita
//        int num=12;
//        double numD=num;
//        System.out.println("Convercion implicita "+num);
//
//        System.out.println(x2);
//        System.out.println(z1);
//        System.out.println(asd);
//
//
//        //Creamos un objeto rdn de clase Random
//        Random rdn=new Random();
//
//
//        //Generamos numeros y los guardamos
//        int numAleatorio=rdn.nextInt();
//        Double numDouble=rdn.nextDouble();
//
//        System.out.println("Aleatorio entero: "+numAleatorio);
//        System.out.println("Aleatorio double: "+numDouble);


//        /*//4. Solicitud de datos
//
//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Introduce cualquier dato");
//        String dato= scn.nextLine();
//
//        System.out.println("Introduce cualquier dato entero");
//        int datoEntero= scn.nextInt();
//
//        System.out.println("Introduce cualquier dato con decimal");
//        double datoDouble= scn.nextDouble();
//
//        System.out.println("Cualquier dato " +dato);
//        System.out.println("Dato entero " +datoEntero);
//        System.out.println("Dato decimal " +datoDouble);*/


//        5. Boolean, operadores logicos y comparacion

        System.out.println(10 > 9); //true
        System.out.println(10 == 9); //false
        System.out.println(10 < 9); //false
        System.out.println(10 >= 9); //true
        System.out.println(10 <= 9); //false
        System.out.println(10 != 9); //true

        int x=3;
        System.out.println(x<5 && x>10); //false
        System.out.println(x<5 || x>10); //true
        System.out.println(!(x< 5 && x>10)); //true



    }


}