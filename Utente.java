import java.util.ArrayList;
import java.util.Date;

public class Utente {
    public String nome;
    public String cognome;
    public Date dataDiNascita;
    public Ruolo ruolo;

    private ArrayList<NumeroDiTelefono> lista_numeri;
    private ArrayList<NumeroDiTelefono> lista_indirizzi;

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

    enum Ruolo {

        AMMINISTRATORE,
        CLIENTE,
        REAPONSABILE,
        CONTABILE,
        RESPONSABILE_MAGAZZINO

    }

    public ArrayList<NumeroDiTelefono> getLista_numeri() {
        return lista_numeri;
    }
    public void setLista_numeri(ArrayList<NumeroDiTelefono> lista_numeri) {
        this.lista_numeri = lista_numeri;
    }

    public ArrayList<NumeroDiTelefono> getLista_indirizzi() {
        return lista_indirizzi;
    }

    public void setLista_indirizzi(ArrayList<NumeroDiTelefono> lista_indirizzi) {
        this.lista_indirizzi = lista_indirizzi;
    }

}
