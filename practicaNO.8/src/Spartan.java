public class Spartan {
    public String nombre;
    int salud;
    int escudo;
    String armaprincipal;

    //Metodos del spartan
    public void mostrarinfo(){
        System.out.println("---Información del Spartan---");
        System.out.println("---Nombre---"+nombre);
        System.out.println("---Salud---"+salud);
        System.out.println("---Escudo---"+escudo);
        System.out.println("---Arma principal---"+armaprincipal);
        System.out.println("---------------------------");
    }
    public void atacar(String enemigo){
        System.out.println(nombre+"Ataca a"+enemigo+"con "+ armaprincipal);
    }

    public void recargArarma(int Municiones){
        //el extra que se va a recargar a la arma.
        int restante= 10;
        int total = restante + Municiones;
        System.out.println("El Arma "+armaprincipal+"tiene "+total+" municiones");
    }
    public void Correr(boolean Status){
  if(Status){
      System.out.println("El Spartan "+ nombre+" esta corriendo");

  }  else {
      System.out.println("El Spartan "+ nombre+" no esta corriendo");
  }
    }
}//llave de la clase
