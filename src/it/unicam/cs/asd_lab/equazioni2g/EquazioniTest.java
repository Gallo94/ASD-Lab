package it.unicam.cs.asd_lab.equazioni2g;
/**
 * xxxx
 */
public class EquazioniTest {

    public static void main(String[] args) {
       EquazioneSecondoGrado e1 = new EquazioneSecondoGrado(1,1,1);
       RisolutoreEquazioniSecondoGrado r = new RisolutoreEquazioniSecondoGrado();
       SoluzioneEquazioneSecondoGrado se1 = r.solve(e1);
       if (se1.isEmptySolution())
           System.out.println("Test OK");
       else System.out.println("Test Non OK");
       EquazioneSecondoGrado e2 = new EquazioneSecondoGrado(1,1,2);
       if (e1.compareTo(e2) < 0)
           System.out.println("Test OK");
       else System.out.println("Test Non OK");
    }

}