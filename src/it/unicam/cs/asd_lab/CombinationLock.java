package it.unicam.cs.asd_lab;

public class CombinationLock
{
	// Stato della cassaforte, true se open altrimenti false
	private boolean open;
	// contiene la combinazione
	private char [] combination;
	
	// Prova ad aprire la cassaforte
	public void open()
	{
		// TODO
		return;
	}
	
	/**
	 * Crea la cassaforte aperta con combinazione iniziale "AAA" 
	 */
	public CombinationLock()
	{
		this.open() = true;
		this.combination = new char[3];
		this.combination[0] = 'A';
		this.combination[1] = 'A';
		this.combination[2] = 'A';
	}
	
	/**
	 * Ritorna lo stato della cassaforte
	 * 
	 * @return lo stato della cassaforte, true se aperta, false se chiusa
	 */
	public boolean isOpen()
	{
		// TODO
		return false;
	}
	
	/**
	 * Gira la manopola in una posizione con una certa lettera
	 * 
	 * @param value la lettura su cui la manopola è stata postas
	 */
	public void setValue(char value)
	{
		// TODO
		return;
	}
	
	/**
	 * Chiude la cassaforte e mantiene la combinazione attiva
	 */
	public void lock()
	{
		// TODO
	}
	
	/**
	 * Chiude la cassaforte
	 * 
	 * param newCombination la nuova combinazione
	 */
	public void isLock(char[] newCombination)
	{
		// TODO
	}
}
