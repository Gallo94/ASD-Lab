package it.unicam.cs.asd_lab.combinationlock;

/** Un oggetto serratura con combinazione può essere   
    impostato tre volte a una certa posizione.
    La serratura si apre solo se la combinazione di tre 
    lettere data è corretta 
   */
public class CombinationLock  {
  
  private String combinazione;
  private boolean chiuso;
  private char ultima;
  private char penultima;
  private char terzultima;
  
  /** Costruisce una cassaforte <b>aperta</b> con una data combinazione
      @param aCombination la combinazione che deve 
             essere una stringa di 3 lettere maiuscole 
             dell'alfabeto inglese
     */
  public CombinationLock(String aCombination) {
      if (aCombination.length() != 3)
         throw new IllegalArgumentException("Combinazione non di 3 lettere");
      // E' lunga 3
      if (!Character.isLetter(aCombination.charAt(0)) || !Character.isUpperCase(aCombination.charAt(0)))
         throw new IllegalArgumentException("Primo simbolo non valido");
      if (!Character.isLetter(aCombination.charAt(1)) || !Character.isUpperCase(aCombination.charAt(1)))
         throw new IllegalArgumentException("secondo simbolo non valido");
      if (!Character.isLetter(aCombination.charAt(2)) || !Character.isUpperCase(aCombination.charAt(2)))
         throw new IllegalArgumentException("Terzo simbolo non valido");
      combinazione = aCombination;
      chiuso = false;
      ultima = 'A';
      penultima = 'A';
      terzultima = 'A';
  }
  
  /** Imposta la ruota su una posizione.
     @param aPosition un carattere lettera maiuscola
    */
  public void setPosition(char aPosition) {
      if (! (Character.isLetter(aPosition) && Character.isUpperCase(aPosition)))
          throw new IllegalArgumentException("Position errata: " + aPosition);
      terzultima = penultima;
      penultima = ultima;
      ultima = aPosition;
  }
  
  /** Tenta di aprire la serratura
    */
  public void unlock() {
      if (combinazione.charAt(0) == terzultima &&
          combinazione.charAt(1)== penultima &&
          combinazione.charAt(2) == ultima)
              chiuso = false;
  }
  
  /** Controlla se la serratura è aperta.
    @return true se la serratura è 
            attualmente aperta
   */
  public boolean isOpen() {
      return !chiuso;
    }
  
  /** Chiude la serratura lasciando la 
      combinazione attuale
    */
  public void lock() {
      chiuso = true;
      // Faccio in modo che, una volta chiusa,
      // non si possa riaprire immediatamente
      ultima = '1';
  }
  /**
   * Funziona solo se la cassaforte è attualmente aperta.
   * Chiude la cassaforte e cambia la combinazione.
   * @param aCombination La nuova combinazione
   */  
  public void lockAndChangeCombination(String aCombination){
      if (!chiuso){
          if (aCombination.length() != 3)
              throw new IllegalArgumentException("Combinazione non di 3 lettere");
           // E' lunga 3
           if (!Character.isLetter(aCombination.charAt(0)) || !Character.isUpperCase(aCombination.charAt(0)))
              throw new IllegalArgumentException("Primo simbolo non valido");
           if (!Character.isLetter(aCombination.charAt(1)) || !Character.isUpperCase(aCombination.charAt(1)))
              throw new IllegalArgumentException("secondo simbolo non valido");
           if (!Character.isLetter(aCombination.charAt(2)) || !Character.isUpperCase(aCombination.charAt(2)))
              throw new IllegalArgumentException("Terzo simbolo non valido");
           combinazione = aCombination;
      }
      // Chiudo e faccio in modo che non sia
      // Immediatamente riapribile
      chiuso = true;
      ultima = '1';
  }
}