public class spartanlv extends spartan {
    public spartanlv(String nombre,int salud,String arma,int escudo) {
        super(nombre,salud,arma,100);
    }

    public void usarpropulsores(){
        System.out.println("El spartan "+nombre+" usa propulsores para moverse rapido");
    }

}
