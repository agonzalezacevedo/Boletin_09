package bolt9_1;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class Calculos {

    private int contador = 0;
    private int positivos = 0;
    private int ceros = 0;
    private int negativos = 0;

    Scanner sc = new Scanner(System.in);

    public void contarNumeros() {
        System.out.println("Inserte 10 numeros: ");
        do {
            int numero = sc.nextInt();
            if (numero > 0) {
                positivos++;
            }
            if (numero < 0) {
                negativos++;
            }
            if (numero == 0) {
                ceros++;
            }
            System.out.println(positivos + " numeros positivos");
            System.out.println(negativos + " numeros negativos");
            System.out.println(ceros + " numeros neutros");
            contador++;
        } while (this.contador < 10);
    }
}
