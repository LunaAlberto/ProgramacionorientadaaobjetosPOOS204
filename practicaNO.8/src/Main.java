public class Main {
    public static void main(String[] args) {

        //Instanciar un objeto de la clase Spartan
        Spartan jefeMaestro = new Spartan("Rifle de asalto MA5B", 90, "Jefe Maestro", 100);
        Spartan lu = new Spartan("Martillo Gravitatorio", 100, "subzero", 100);

        //Uasr sus metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);

        //Uasr sus metodos
        lu.mostrarInfo();
        lu.atacar("covenant");
        lu.recargarArma(15);
        lu.correr(true);

    }

}