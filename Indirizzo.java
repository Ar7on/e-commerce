/**
 * The type Indirizzo.
 */
public class Indirizzo {
    private String via;
    private String CAP;
    private String città;
    private Tipo_Indirizzo tipo;

    /**
     * Instantiates a new Indirizzo.
     *
     * @param via   the via
     * @param CAP   the cap
     * @param città the città
     * @param tipo  the tipo
     */
    public  Indirizzo (String via,String CAP,String città,Tipo_Indirizzo tipo){
        this.via = via;
        this.CAP = CAP;
        this.città = città;
        this.tipo = tipo;
    }


    /**
     * The enum Tipo indirizzo.
     */
    enum Tipo_Indirizzo{

        /**
         * Fatturazione tipo indirizzo.
         */
        FATTURAZIONE,
        /**
         * Spedizione tipo indirizzo.
         */
        SPEDIZIONE

    }

    /**
     * Gets via.
     *
     * @return the via
     */
    public String getVia() {
        return via;
    }

    /**
     * Sets via.
     *
     * @param via the via
     */
    public void setVia(String via) {
        this.via = via;
    }

    /**
     * Gets cap.
     *
     * @return the cap
     */
    public String getCAP() {
        return CAP;
    }

    /**
     * Sets cap.
     *
     * @param CAP the cap
     */
    public void setCAP(String CAP) {
        this.CAP = CAP;
    }

    /**
     * Get città string.
     *
     * @return the string
     */
    public String getCittà() {
        return città;
    }

    /**
     * Set città.
     *
     * @param città the città
     */
    public void setCittà(String città) {
        this.città = città;
    }

    /**
     * Gets tipo.
     *
     * @return the tipo
     */
    public Tipo_Indirizzo getTipo() {
        return tipo;
    }

    /**
     * Sets tipo.
     *
     * @param tipo the tipo
     */
    public void setTipo(Tipo_Indirizzo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Indirizzo{" +
                "via='" + via + '\'' +
                ", CAP='" + CAP + '\'' +
                ", città='" + città + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
