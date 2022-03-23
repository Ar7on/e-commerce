public class Indirizzo {
    private String via;
    private String CAP;
    private String città;
    private Tipo_Indirizzo tipo;

    public  Indirizzo (String via,String CAP,String città,Tipo_Indirizzo tipo){
        this.via = via;
        this.CAP = CAP;
        this.città = città;
        this.tipo = tipo;
    }


    enum Tipo_Indirizzo{

        FATTURAZIONE,
        SPEDIZIONE

    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCAP() {
        return CAP;
    }

    public void setCAP(String CAP) {
        this.CAP = CAP;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public Tipo_Indirizzo getTipo() {
        return tipo;
    }

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
