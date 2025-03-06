public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        spartanll jefemaestro = new spartanll("Jonh",100,"Puñoz",0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Covenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();


        spartanlll jefemaestroll = new spartanlll("Beto",30,"Puñoz",0);
        jefemaestroll.mostrarInfo();
        jefemaestroll.camuflajeactivo();
        jefemaestroll.atacar("Devora mundos");
        jefemaestroll.recibirDano(20);
        jefemaestroll.recargarEscudo();

        spartanlv jefemaestrolv = new spartanlv("Angel",40,"Pistola",0);
        jefemaestrolv.mostrarInfo();
        jefemaestrolv.usarpropulsores();
        jefemaestrolv.atacar("La luna");
        jefemaestrolv.recibirDano(60);
        jefemaestrolv.recargarEscudo();

    }
}