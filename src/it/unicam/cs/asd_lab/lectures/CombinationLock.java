package it.unicam.cs.asd_lab.lectures;

public class CombinationLock {
    // stato della cassaforte, true se open, false se closed
    private boolean open;

    // contiene la combinazione
    private char[] combination;

    /**
     * Crea una cassaforte aperta con combinazione iniziale "AAA".
     */
    public CombinationLock() {
        this.open = true;
        this.combination = new char[3];
        this.combination[0] = 'A';
        this.combination[1] = 'A';
        this.combination[2] = 'A';
    }

    public CombinationLock(char[] combinazione) {
        this.open = true;
        if (combinazione == null) {
            throw new IllegalArgumentException("Tentativo di creare una "
                    + "cassaforte con combinazione nulla");
        }
        if (combinazione.length != 3)
            throw new IllegalArgumentException("Tentativo di creare una "
                    + "cassaforte con combinazione non lunga tre");
        if (!Character.isUpperCase(combinazione[0])
                || !Character.isUpperCase(combinazione[1])
                || !Character.isUpperCase(combinazione[2]))
            throw new IllegalArgumentException("Tentativo di creare una "
                    + "cassaforte con combinazione non formata da lettere "
                    + "maiuscole");
        this.combination = combinazione;       
    }

    /**
     * Prova ad aprire la cassaforte.
     */
    public void open() {
        // TODO
        return;
    }

    /**
     * Ritorna lo stato della cassaforte.
     * 
     * @return lo stato della cassaforte, true se aperta, false se chiusa
     */
    public boolean isOpen() {
        // TODO
        return false;
    }

    /**
     * Gira la manopola in una posizione con una certa lettera.
     * 
     * @param value
     *                  la lettera su cui la manopola è stata posta.
     */
    public void setValue(char value) {
        // TODO
        return;
    }

    /**
     * Chiude la cassaforte e mantiene la combinazione attuale.
     */
    public void lock() {
        // TODO
    }

    /**
     * Chiude la cassaforte e cambia la combinazione.
     * 
     * @param newCombination
     *                           la nuova combinazione.
     */
    public void lock(char[] newCombination) {
        // TODO
    }

}
