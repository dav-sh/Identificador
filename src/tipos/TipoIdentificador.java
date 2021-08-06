package src.tipos;
public enum TipoIdentificador{
    ID("Soy un id"),
    ENTERO("Soy un entero"),
    DECIMAL("Soy un decimal");

    private String tipo;

    private TipoIdentificador(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}