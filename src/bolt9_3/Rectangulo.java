package bolt9_3;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class Rectangulo {

    private float base;
    private float altura;
    private float valor;
    Scanner sc = new Scanner(System.in);

    public float validar() {
        do {
            valor = sc.nextFloat();
        } while (valor <= 0);
        return valor;
    }

    public void calcular() {
        System.out.println("Altura?");
        altura = validar();
        System.out.println("Base?");
        base = validar();
        System.out.println(base * altura);
    }
}
