package it.unicam.cs.asd_lab.lectures;

public class CombinationLockTester {

    public static void main(String[] args) {
        CombinationLock c = new CombinationLock();
        if (c.isOpen()) 
            System.out.println("OK - cassaforte aperta all'inizio");
        else 
            System.out.println("NOK - cassaforte chiusa all'inizio");
        //... controllare tutti i metodi
        

    }

}
