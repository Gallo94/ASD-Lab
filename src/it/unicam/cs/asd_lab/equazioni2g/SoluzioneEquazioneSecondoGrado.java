package it.unicam.cs.asd_lab.equazioni2g;
/**
 * 
 * @author luca
 *
 */
public class SoluzioneEquazioneSecondoGrado {
    final private double s1;
    final private double s2;
    final private boolean emptySolution;
    final private boolean oneSolution;
    /**
     * Costruisce una soluzione vuota.
     */
    public SoluzioneEquazioneSecondoGrado(){
        this.emptySolution = true;
        this.oneSolution = false;
        this.s1 = Double.NaN;
        this.s2 = Double.NaN;
    }
    /**
     * 
     * @param s1
     */
    public SoluzioneEquazioneSecondoGrado(double s1){
        this.emptySolution = false;
        this.oneSolution = true;
        this.s1 = s1;
        this.s2 = Double.NaN;
    }
    /**
     * 
     * @param s1
     * @param s2
     */
    public SoluzioneEquazioneSecondoGrado(double s1, double s2){
        this.emptySolution = false;
        this.oneSolution = false;
        this.s1 = s1;
        this.s2 = s2;
    }
    /**
     * @return the s1
     */
    public double getS1() {
        return s1;
    }
    /**
     * @return the s2
     */
    public double getS2() {
        return s2;
    }
    /**
     * @return the emptySolution
     */
    public boolean isEmptySolution() {
        return emptySolution;
    }
    /**
     * @return the oneSolution
     */
    public boolean isOneSolution() {
        return oneSolution;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (emptySolution ? 1231 : 1237);
        result = prime * result + (oneSolution ? 1231 : 1237);
        long temp;
        temp = Double.doubleToLongBits(s1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(s2);
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
        if (!(obj instanceof SoluzioneEquazioneSecondoGrado))
            return false;
        SoluzioneEquazioneSecondoGrado other = (SoluzioneEquazioneSecondoGrado) obj;
        if (emptySolution != other.emptySolution)
            return false;
        if (oneSolution != other.oneSolution)
            return false;
        if (Double.doubleToLongBits(s1) != Double.doubleToLongBits(other.s1))
            return false;
        if (Double.doubleToLongBits(s2) != Double.doubleToLongBits(other.s2))
            return false;
        return true;
    }
   
}
