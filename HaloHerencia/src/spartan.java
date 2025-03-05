public class spartan extends soldado {
    private int escudo;

    public spartan(String nombre,int salud,String arma,int escudo) {
        super(nombre,salud,arma);
        this.escudo=escudo;
    }

    //recargar escudo
    public void recargarEscudo() {
        escudo = 100;
        System.out.println("El spartan " + nombre+"recargo escudo al maximo");
    }


    @Override
    public void recibirDano(int dano) {
        if(dano>0) {
escudo -= dano;
if(escudo< 0) {
    salud +=escudo;
    escudo=0;
}
            System.out.println("El spartan:" + nombre+"Recibio daño,escudo:"+escudo+"Salud:"+salud);
        }else {
            super.recibirDano(dano);
        }
    }
@Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escudo"+this.escudo);
    }


}
