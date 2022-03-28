/**
 * The type Numero di telefono.
 */
public class NumeroDiTelefono {
    private String numero;

    /**
     * Instantiates a new Numero di telefono.
     *
     * @param numero the numero
     */
    public NumeroDiTelefono(String numero){
        this.numero = numero;
    }

    /**
     * Gets numero.
     *
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets numero.
     *
     * @param numero the numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "NumeroDiTelefono{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
