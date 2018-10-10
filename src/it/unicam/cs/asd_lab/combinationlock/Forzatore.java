package it.unicam.cs.asd_lab.combinationlock;

/**
 * Riceve una cassaforte e trova la combinazione utilizzando la "forza bruta"
 * @author luca
 *
 */
public class Forzatore {
    private CombinationLock cassaforte;
    private long tentativi;
    public Forzatore(CombinationLock aCassaforte){
        cassaforte = aCassaforte;
        tentativi = 0;
    }
    /**
     * Restituisce la combinazione della cassaforte che
     * ha forzato.
     * @return la combinazione della cassaforte forzata.
     */
    public String findCombination(){
        tentativi = 0;
        char c1, c2, c3;
        for (c1 = 'A'; c1 <= 'Z'; c1++)
            for (c2 = 'A'; c2 <= 'Z'; c2++)
                for (c3 = 'A'; c3 <= 'Z'; c3++){
                    tentativi++;
                    cassaforte.setPosition(c1);
                    cassaforte.setPosition(c2);
                    cassaforte.setPosition(c3);
                    cassaforte.unlock();
                    if(cassaforte.isOpen()){
                        StringBuffer s = new StringBuffer();
                        s.append(c1);
                        s.append(c2);
                        s.append(c3);
                        return s.toString();
                    } 
                }
        return null;
    }
    /**
     * Restituisce il numero di tentativi che ci sono
     * voluti per trovare la combinazione.
     * @return il numero di tentativi che ci sono
     * voluti per trovare la combinazione.
     */
    public long getTentativi(){
        return tentativi;
    }
}
