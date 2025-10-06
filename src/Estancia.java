import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

public class Estancia {
    private final UUID id = UUID.randomUUID();
    private final Vehiculo vehiculo;
    private final LocalDateTime entrada;
    private LocalDateTime salida;

    public Estancia(Vehiculo vehiculo, LocalDateTime entrada) {
        if (vehiculo == null || entrada == null) {
            throw new IllegalArgumentException("Vehículo y entrada son obligatorios.");
        }
        this.vehiculo = vehiculo;
        this.entrada = entrada;
    }

    public UUID getId() {
        return id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public Duration getDuracion() {
        LocalDateTime fin = salida != null ? salida : LocalDateTime.now();
        return Duration.between(entrada, fin);
    }

    public void cerrar(LocalDateTime salida) {
        if (salida == null) throw new IllegalArgumentException("Fecha salida no puede ser nula.");
        if (salida.isBefore(entrada))
            throw new IllegalArgumentException("Fecha salida no puede ser antes de fecha entrada.");

        this.salida = salida;
    }
}
