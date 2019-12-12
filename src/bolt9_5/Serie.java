package bolt9_5;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class Serie {

    Scanner sc = new Scanner(System.in);
    private int cont;
    private int elem;
    private int aux_1 = 1;
    private int num;

    public void calcular() {
        System.out.println("Numero de elementos: ");
        elem = sc.nextInt();
        for (cont = 0; cont < elem; cont++) {
            num += 2;
            System.out.println(num);
        }
        for (cont = 1; cont <= elem; cont++) {
            if (cont % 2 == 0) {
                num = cont;
            } else {
                num = -(cont);
            }
            System.out.println(num);
        }
        num = 0;
        for (cont = 0; cont < elem; cont++) {
            System.out.println(num);
            num = num + aux_1;
            aux_1 = num - aux_1;
        }
    }
}
