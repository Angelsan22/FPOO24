public class Main {
    public static void main(String[] args) {

        //Creamos Objeto = Instancia objeto
        Spartan jefeMaestro = new Spartan();
        Spartan reach = new Spartan();

        //Asignamos los atributos del objeto
        jefeMaestro.nombre = "Jonh ";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal = "Fusil de asalto";

        //Usar sus metodos
        jefeMaestro.mostarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        reach.nombre = "Emile ";
        reach.salud = 0;
        reach.escudo = 0;
        reach.armaPrincipal = "Aguijoneador";

        reach.mostarInfo();
        reach.atacar("Grunt");
        reach.recargarArma(10);
        reach.correr(false);
    }

}