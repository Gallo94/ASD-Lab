package it.unicam.cs.asd_lab.combinationlock;

import javax.swing.JOptionPane;

public class Test
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        String input = JOptionPane.showInputDialog("Dammi la combinazione");
        CombinationLock c = new CombinationLock(input);
        c.lock();
        Forzatore f = new Forzatore(c);
        System.out.println("Il forzatore  dice che la combinazione è " + f.findCombination());
        System.out.println("Il forzatore ha effettuato " + f.getTentativi() + " tentativi prima di trovare la combinazione.");
        System.exit(0);
    }

}
