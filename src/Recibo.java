public class Recibo {
    private final Estancia estancia;
    private final double total;

    public Recibo(Estancia estancia, double total) {
        if (estancia == null) {
            throw new IllegalArgumentException("Estancia no puede ser nula");
        }
        this.estancia = estancia;
        this.total = total;
    }

    public Estancia getEstancia() {
        return estancia;
    }

    public double getTotal() {
        return total;
    }
}
