public class Main {
    public static void main(String[] args) {

        //Creamos Objeto = Instancia objeto
        Spartan jefeMaestro = new Spartan("Jonh", 100, 90, "Fusil de asalto");
        Spartan reach = new Spartan("Emile", 100, 90, "Aguijoneador");


        //Usar sus metodos
        jefeMaestro.mostarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        reach.setNombre("Emile");
        reach.setSalud(0);
        reach.setEscudo(0);
        reach.setArmaPrincipal("Aguijoneador");

        reach.mostarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(10);
        reach.correr(false);

        jefeMaestro.setNombre("José Ángel");
        jefeMaestro.mostarInfo();
        System.out.println(jefeMaestro.getNombre());
    }

}