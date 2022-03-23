import java.util.ArrayList;

public class OrdineVendita {
    private Utente cliente;
    private Indirizzo indirizzo;
    private Indirizzo indirizzoSpedizione;
    private Articolo articolo;
    private stato_vendita stato;
    private pagamento tipo_pagamento;

    public OrdineVendita(Utente cliente,Indirizzo indirizzo,Indirizzo indirizzoSpedizione,Articolo articolo,stato_vendita stato,pagamento tipo_pagamento){
        this.cliente = cliente;
        this.indirizzo = indirizzo;
        this.indirizzoSpedizione = indirizzoSpedizione;
        this.articolo = articolo;
        this.stato = stato;
        this.tipo_pagamento = tipo_pagamento;
    }

    public Utente getCliente() {
        return cliente;
    }

    public void setCliente(Utente cliente) {
        this.cliente = cliente;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Indirizzo getIndirizzoSpedizione() {
        return indirizzoSpedizione;
    }

    public void setIndirizzoSpedizione(Indirizzo indirizzoSpedizione) {
        this.indirizzoSpedizione = indirizzoSpedizione;
    }

    public Articolo getArticolo() {
        return articolo;
    }

    public void setArticolo(Articolo articolo) {
        this.articolo = articolo;
    }

    public stato_vendita getStato() {
        return stato;
    }

    public void setStato(stato_vendita stato) {
        this.stato = stato;
    }

    public pagamento getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setTipo_pagamento(pagamento tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    @Override
    public String toString() {
        return "OrdineVendita{" +
                "cliente=" + cliente +
                ", indirizzo=" + indirizzo +
                ", indirizzoSpedizione=" + indirizzoSpedizione +
                ", articolo=" + articolo +
                ", stato=" + stato +
                ", tipo_pagamento=" + tipo_pagamento +
                '}';
    }

    enum stato_vendita{
        CREATO,
        PAGATO,
        SPEDITO,
        CONSEGNATO
    }
    enum pagamento{
        BONIFICO,
        PAYPAL,
        CARTA_DI_CREDITO
    }

    public static void main(String[] args) {
        Articolo articolo = new Articolo("woo","MarshalDragSpeakes","One big column speake",245.50, Articolo.categoria.STEREO_SPEAKERS);
        ArrayList<Articolo> speakers = new ArrayList<>();
        speakers.add(articolo);
        System.out.print(speakers);


    }
}
