import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.*;
public class convertir {
    public String numero;
    public String esvalido;

    public convertir(String numero) {
        this.numero = numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String con(String numero) {
        TreeMap<Integer, String> mapa = new TreeMap<>();
        mapa.put(50, "L");
        mapa.put(40, "XL");
        mapa.put(10, "X");
        mapa.put(9, "IX");
        mapa.put(5, "V");
        mapa.put(4, "IV");
        mapa.put(1, "I");

        if (numero.matches("\\d+")) {
            int n = Integer.parseInt(numero);
            if (n < 1 || n > 50) return "Número fuera de rango";
            StringBuilder r = new StringBuilder();
            for (int k : mapa.descendingKeySet()) {
                while (n >= k) {
                    r.append(mapa.get(k));
                    n -= k;
                }
            }




            return "El numero " + numero + " en romano es " + r.toString();
        } else {
            String r = numero.toUpperCase();
            Map<Character, Integer> valores = new HashMap<>();
            valores.put('I', 1);
            valores.put('V', 5);
            valores.put('X', 10);
            valores.put('L', 50);
            int total = 0, prev = 0;
            for (int i = r.length() - 1; i >= 0; i--) {
                int val = valores.getOrDefault(r.charAt(i), 0);
                if (val < prev) total -= val;
                else total += val;
                prev = val;
            }
            String verificacion = con(String.valueOf(total)).toLowerCase();
            if (total < 1 || total > 50 || !verificacion.contains(r.toLowerCase()))
                return "Numero romano fuera de rango o invalido";

            return "El número " + r + " en arábigo es " + total;
        }
    }
}


