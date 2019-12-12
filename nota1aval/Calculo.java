package nota1aval;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Calculo {

    private float teorico1;
    private float teorico2;
    private float boletines;
    private float practico;

    Scanner sc = new Scanner(System.in);

    public Calculo() {

    }

    public void calcularNota() {
        System.out.println("Cal e o nome do alumno?");
        String nombre = sc.next();
        while (!"fin".equals(nombre) ||!"Fin".equals(nombre)||!"FIN".equals(nombre)) {
            do {
                System.out.println("Cal e a nota do teorico 1?");
                teorico1 = sc.nextFloat();
            } while (teorico1 < 0);
            do {
                System.out.println("Cal e a nota do teorico 2?");
                teorico2 = sc.nextFloat();
            } while (teorico2 < 0);
            float mediaTeorico = (float) (((teorico1 + teorico2) / 2) * 0.4);
            System.out.println("Os exames teoricos aportan " + mediaTeorico + " de un maximo de 4 puntos");
            do {
                System.out.println("Cal e a nota do practico?");
                practico = sc.nextFloat();
            } while (practico < 0);
            float notapractico = (float) (practico * 0.4);
            System.out.println("O exame practico aporta " + notapractico + " de un maximo de 4 puntos");
            do {
                System.out.println("Cantos boletines ten entregados?");
                boletines = sc.nextFloat();
            } while (boletines < 0);
            boletines = ((boletines / 19) * 100);
            int notaBoletin;
            if (boletines >= 90) {
                notaBoletin = 2;
            } else if (boletines > 70) {
                notaBoletin = 1;
            } else {
                notaBoletin = 0;
            }
            System.out.println("Os boletins aportan " + notaBoletin + " de un maximo de 2 puntos");
            float notaTotal = mediaTeorico + notapractico + notaBoletin;
            notaTotal = Math.round(notaTotal);
            System.out.println("Nota primer trimestre=" + notaTotal);
            System.out.println("Cal e o nome do alumno?");
            nombre = sc.next();

        }
    }

}
