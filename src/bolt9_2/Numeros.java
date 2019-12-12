package bolt9_2;

/**
 *
 * @author agonzalezacevedo
 */
public class Numeros {

    private int suma;
    private double producto = 1;
    private int contador = 10;

    public void calcular() {
        for (contador = 10; contador <= 90; contador++) {
            suma = contador + suma;
            producto = contador * producto;
        }
        System.out.println("La multiplicacion de los numeros entre el 10 y el 90 es: " + producto + "y la suma es: " + suma);
    }
}
