import java.util.ArrayList;
import java.util.Date;

/**
 * The type Utente.
 */
public class Utente {
    /**
     * The Nome.
     */
    public String nome;
    /**
     * The Cognome.
     */
    public String cognome;
    /**
     * The Data di nascita.
     */
    public Date dataDiNascita;
    /**
     * The Ruolo.
     */
    public Ruolo ruolo;

    private ArrayList<NumeroDiTelefono> lista_numeri;
    private ArrayList<NumeroDiTelefono> lista_indirizzi;

    /**
     * Instantiates a new Utente.
     *
     * @param nome            the nome
     * @param cognome         the cognome
     * @param dataDiNascita   the data di nascita
     * @param ruolo           the ruolo
     * @param lista_numeri    the lista numeri
     * @param lista_indirizzi the lista indirizzi
     */
    public  Utente(String nome,String cognome,Date dataDiNascita,Ruolo ruolo,ArrayList<NumeroDiTelefono> lista_numeri,ArrayList<NumeroDiTelefono> lista_indirizzi){
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.ruolo = ruolo;
        this.lista_numeri = lista_numeri;
        this.lista_indirizzi = lista_indirizzi;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", ruolo=" + ruolo +
                ", lista_numeri=" + lista_numeri +
                ", lista_indirizzi=" + lista_indirizzi +
                '}';
    }

    /**
     * The enum Ruolo.
     */
    enum Ruolo {

        /**
         * Amministratore ruolo.
         */
        AMMINISTRATORE,
        /**
         * Cliente ruolo.
         */
        CLIENTE,
        /**
         * Reaponsabile ruolo.
         */
        REAPONSABILE,
        /**
         * Contabile ruolo.
         */
        CONTABILE,
        /**
         * Responsabile magazzino ruolo.
         */
        RESPONSABILE_MAGAZZINO

    }

    /**
     * Gets lista numeri.
     *
     * @return the lista numeri
     */
    public ArrayList<NumeroDiTelefono> getLista_numeri() {
        return lista_numeri;
    }

    /**
     * Sets lista numeri.
     *
     * @param lista_numeri the lista numeri
     */
    public void setLista_numeri(ArrayList<NumeroDiTelefono> lista_numeri) {
        this.lista_numeri = lista_numeri;
    }

    /**
     * Gets lista indirizzi.
     *
     * @return the lista indirizzi
     */
    public ArrayList<NumeroDiTelefono> getLista_indirizzi() {
        return lista_indirizzi;
    }

    /**
     * Sets lista indirizzi.
     *
     * @param lista_indirizzi the lista indirizzi
     */
    public void setLista_indirizzi(ArrayList<NumeroDiTelefono> lista_indirizzi) {
        this.lista_indirizzi = lista_indirizzi;
    }

}
