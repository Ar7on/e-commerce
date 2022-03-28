import java.util.ArrayList;

/**
 * The type Ordine vendita.
 */
public class OrdineVendita {
    private Utente cliente;
    private Indirizzo indirizzo;
    private Indirizzo indirizzoSpedizione;
    private Articolo articolo;
    private stato_vendita stato;
    private pagamento tipo_pagamento;

    /**
     * Instantiates a new Ordine vendita.
     *
     * @param cliente             the cliente
     * @param indirizzo           the indirizzo
     * @param indirizzoSpedizione the indirizzo spedizione
     * @param articolo            the articolo
     * @param stato               the stato
     * @param tipo_pagamento      the tipo pagamento
     */
    public OrdineVendita(Utente cliente,Indirizzo indirizzo,Indirizzo indirizzoSpedizione,Articolo articolo,stato_vendita stato,pagamento tipo_pagamento){
        this.cliente = cliente;
        this.indirizzo = indirizzo;
        this.indirizzoSpedizione = indirizzoSpedizione;
        this.articolo = articolo;
        this.stato = stato;
        this.tipo_pagamento = tipo_pagamento;
    }

    /**
     * Gets cliente.
     *
     * @return the cliente
     */
    public Utente getCliente() {
        return cliente;
    }

    /**
     * Sets cliente.
     *
     * @param cliente the cliente
     */
    public void setCliente(Utente cliente) {
        this.cliente = cliente;
    }

    /**
     * Gets indirizzo.
     *
     * @return the indirizzo
     */
    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    /**
     * Sets indirizzo.
     *
     * @param indirizzo the indirizzo
     */
    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * Gets indirizzo spedizione.
     *
     * @return the indirizzo spedizione
     */
    public Indirizzo getIndirizzoSpedizione() {
        return indirizzoSpedizione;
    }

    /**
     * Sets indirizzo spedizione.
     *
     * @param indirizzoSpedizione the indirizzo spedizione
     */
    public void setIndirizzoSpedizione(Indirizzo indirizzoSpedizione) {
        this.indirizzoSpedizione = indirizzoSpedizione;
    }

    /**
     * Gets articolo.
     *
     * @return the articolo
     */
    public Articolo getArticolo() {
        return articolo;
    }

    /**
     * Sets articolo.
     *
     * @param articolo the articolo
     */
    public void setArticolo(Articolo articolo) {
        this.articolo = articolo;
    }

    /**
     * Gets stato.
     *
     * @return the stato
     */
    public stato_vendita getStato() {
        return stato;
    }

    /**
     * Sets stato.
     *
     * @param stato the stato
     */
    public void setStato(stato_vendita stato) {
        this.stato = stato;
    }

    /**
     * Gets tipo pagamento.
     *
     * @return the tipo pagamento
     */
    public pagamento getTipo_pagamento() {
        return tipo_pagamento;
    }

    /**
     * Sets tipo pagamento.
     *
     * @param tipo_pagamento the tipo pagamento
     */
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

    /**
     * The enum Stato vendita.
     */
    enum stato_vendita{
        /**
         * Creato stato vendita.
         */
        CREATO,
        /**
         * Pagato stato vendita.
         */
        PAGATO,
        /**
         * Spedito stato vendita.
         */
        SPEDITO,
        /**
         * Consegnato stato vendita.
         */
        CONSEGNATO
    }

    /**
     * The enum Pagamento.
     */
    enum pagamento{
        /**
         * Bonifico pagamento.
         */
        BONIFICO,
        /**
         * Paypal pagamento.
         */
        PAYPAL,
        /**
         * Carta di credito pagamento.
         */
        CARTA_DI_CREDITO
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Articolo articolo = new Articolo("woo","MarshalDragSpeakes","One big column speake",245.50, Articolo.categoria.STEREO_SPEAKERS);
        ArrayList<Articolo> speakers = new ArrayList<>();
        speakers.add(articolo);
        System.out.print(speakers);


    }
}
