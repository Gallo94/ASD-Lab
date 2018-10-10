package it.unicam.cs.asd_lab.equazioni2g;
/**
 * pppppp
 * @author luca
 *
 */
public class EquazioneSecondoGrado implements Comparable<EquazioneSecondoGrado>{
    final private double a;

    final private double b;

    final private double c;

    /**
     * Costruisce una equazione di secondo grado.
     * 
     * @param a
     *            coefficiente del termine x^2, deve essere diverso da zero.
     * @param b
     *            coefficiente del termine x
     * @param c
     *            coefficiente del termine x^0
     */
    public EquazioneSecondoGrado(double a, double b, double c) {
        if (a == 0)
            throw new IllegalArgumentException("L'equazione di secondo grado"
                    + " non può avere coefficiente a uguale a zero");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof EquazioneSecondoGrado))
            return false;
        EquazioneSecondoGrado other = (EquazioneSecondoGrado) obj;
        if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
            return false;
        if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
            return false;
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
            return false;
        return true;
    }

    /**
     * L'ordinamento naturale .....
     */
    @Override
    public int compareTo(EquazioneSecondoGrado o) {
        if (this.a < o.a)
            return -100;
        else if (this.a > o.a)
            return 100;
        // le a sono uguali
        // controllo le b
        if (this.b < o.b)
            return -100;
        else if (this.b > o.b)
            return 100;
     // le b sono uguali
        // controllo le c
        if (this.c < o.c)
            return -100;
        else if (this.c > o.c)
            return 100;
        // uguali
        return 0;       
    }
    
//    public boolean equals (Object o) {
//        if (o==null)
//            return false;
//        // L'oggetto o non è nullo
//        if (!(o instanceof EquazioneSecondoGrado))
//            return false;
//        // L'oggetto o è della classe giusta
//        EquazioneSecondoGrado e = (EquazioneSecondoGrado) o;
//        return this.a == e.a && this.b == e.b && this.c == e.c;
//    }
    
}
