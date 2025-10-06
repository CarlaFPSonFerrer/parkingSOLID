import java.time.Duration;

public class TarifaHora implements TarifaEstrategia {
    private final double precioHora;

    public TarifaHora(double precioHora) {
        if (precioHora < 0) throw new IllegalArgumentException("Precio/hora inválido.");
        this.precioHora = precioHora;
    }

    @Override
    public double calcularTarifa(Duration duration) {
        long minutos = Math.max(0, duration.toMinutes());
        long horasACobrar = (minutos + 59) / 60;
        return horasACobrar * precioHora;
    }

}
