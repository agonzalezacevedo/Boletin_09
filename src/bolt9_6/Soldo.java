package bolt9_6;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class Soldo {

    private int soldo;
    private int num1;
    private int num2;
    private int numt;
    Scanner sc = new Scanner(System.in);

    public void salario() {
        do {
            System.out.println("Dime o teu salario");
            soldo = sc.nextInt();
            if (soldo > 0) {
                if (soldo < 1000) {
                    num1++;
                    numt++;
                } else if (soldo <= 1750) {
                    num2++;
                    numt++;
                }
            } else if (soldo < 0) {
                System.out.println("Non podes ter un salario negativo");
            }

        } while (soldo != 0);
        System.out.println("Numero traballadores que cobran entre 1000 e 1750=" + num2 + "\n Porcentaxe traballadores que cobran menos de 1000= " + (num1 / numt));

    }
}
