/**
 * The type Articolo.
 */
public class Articolo {
    private String id;
    private String nomeArticolo;
    private String descrizione;
    private double prezzo;
    private categoria categoriaArticolo;

    /**
     * Instantiates a new Articolo.
     *
     * @param id                the id
     * @param nomeArticolo      the nome articolo
     * @param descrizione       the descrizione
     * @param prezzo            the prezzo
     * @param categoriaArticolo the categoria articolo
     */
    public Articolo(String id,String nomeArticolo,String descrizione,double prezzo,categoria categoriaArticolo){
        this.id = id;
        this.nomeArticolo = nomeArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.categoriaArticolo = categoriaArticolo;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets nome articolo.
     *
     * @return the nome articolo
     */
    public String getNomeArticolo() {
        return nomeArticolo;
    }

    /**
     * Sets nome articolo.
     *
     * @param nomeArticolo the nome articolo
     */
    public void setNomeArticolo(String nomeArticolo) {
        this.nomeArticolo = nomeArticolo;
    }

    /**
     * Gets descrizione.
     *
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets descrizione.
     *
     * @param descrizione the descrizione
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * Gets prezzo.
     *
     * @return the prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * Sets prezzo.
     *
     * @param prezzo the prezzo
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Gets categoria articolo.
     *
     * @return the categoria articolo
     */
    public categoria getCategoriaArticolo() {
        return categoriaArticolo;
    }

    /**
     * Sets categoria articolo.
     *
     * @param categoriaArticolo the categoria articolo
     */
    public void setCategoriaArticolo(categoria categoriaArticolo) {
        this.categoriaArticolo = categoriaArticolo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "id='" + id + '\'' +
                ", nomeArticolo='" + nomeArticolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", categoriaArticolo=" + categoriaArticolo +
                '}';
    }

    /**
     * The enum Categoria.
     */
    enum categoria  {
        /**
         * Laptop categoria.
         */
        LAPTOP,
        /**
         * Smartphone categoria.
         */
        SMARTPHONE,
        /**
         * Headphone categoria.
         */
        HEADPHONE,
        /**
         * Stereo speakers categoria.
         */
        STEREO_SPEAKERS
    }
}
