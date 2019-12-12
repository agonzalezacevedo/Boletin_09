package bolt9_4;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class Tabla {

    Scanner sc = new Scanner(System.in);
    private int num;
    private int i;

    public void multiplicar() {
        do {
            System.out.println("Dime un numero: ");
            num = sc.nextInt();
            if (num != 0) {
                for (i = 1; i < 11; i++) {
                    System.out.println(num + "*" + i + "= " + (num * i));
                }
            }
        } while (num != 0);
    }
}
