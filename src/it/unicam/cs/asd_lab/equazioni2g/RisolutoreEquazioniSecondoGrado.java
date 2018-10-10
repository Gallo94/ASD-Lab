package it.unicam.cs.asd_lab.equazioni2g;
/**
 * 
 * @author luca
 *
 */
public class RisolutoreEquazioniSecondoGrado {
    /**
     * 
     * @param e
     * @return
     */
    public SoluzioneEquazioneSecondoGrado solve(EquazioneSecondoGrado e) {
        double delta = e.getB()*e.getB() - 4 * e.getA() * e.getC();
        if (delta < 0)
            return new SoluzioneEquazioneSecondoGrado();
        // delta >= 0
        if (delta == 0 )
            return new SoluzioneEquazioneSecondoGrado((-e.getB())/2*e.getA());
        // delta > 0
        double tmp = Math.sqrt(delta);
        return new SoluzioneEquazioneSecondoGrado((-e.getB() + tmp) / 2*e.getA(),
                (-e.getB() - tmp) / 2*e.getA() );
    }
}
