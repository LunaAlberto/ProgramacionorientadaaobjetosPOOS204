public class Main {

    public static void main(String[] args) {

        //crear objeto/Creamos objeto=Intanciar del objetos.
       Spartan jefeMaestro = new Spartan();
       Spartan reach = new Spartan();

       //asignamos los atributos del objeto
       jefeMaestro.nombre = " John 117 ";
       jefeMaestro.salud=100;
       jefeMaestro.escudo=90;
       jefeMaestro.armaprincipal=" Rifle de asalto ";

       //Usar sus metodos

        jefeMaestro.mostrarinfo();
        jefeMaestro.atacar(" Elite ");
        jefeMaestro.recargArarma(65);
        jefeMaestro.Correr(true);

        /*
        reach
         */

        //Segundo objeto
        reach.nombre = " Emilie ";
        reach.salud=0;
        reach.escudo=0;
        reach.armaprincipal=" Puños ";

        //Usar sus metodos

        reach.mostrarinfo();
        reach.atacar(" Grunt ");
        reach.recargArarma(10);
        reach.Correr(false);


    }
}//llave de la clase