public class NumeroDiTelefono {
    private String numero;

    public NumeroDiTelefono(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

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
