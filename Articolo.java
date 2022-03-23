public class Articolo {
    private String id;
    private String nomeArticolo;
    private String descrizione;
    private double prezzo;
    private categoria categoriaArticolo;

    public Articolo(String id,String nomeArticolo,String descrizione,double prezzo,categoria categoriaArticolo){
        this.id = id;
        this.nomeArticolo = nomeArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.categoriaArticolo = categoriaArticolo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeArticolo() {
        return nomeArticolo;
    }

    public void setNomeArticolo(String nomeArticolo) {
        this.nomeArticolo = nomeArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public categoria getCategoriaArticolo() {
        return categoriaArticolo;
    }

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

    enum categoria  {
        LAPTOP,
        SMARTPHONE,
        HEADPHONE,
        STEREO_SPEAKERS
    }
}
