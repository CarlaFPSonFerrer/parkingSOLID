import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Estancia {
    private Vehiculo vehiculo;
    private LocalDateTime entrada;
    private LocalDateTime salida;

    public Estancia(Vehiculo vehiculo, LocalDateTime entrada, LocalDateTime salida) {
        this.vehiculo = vehiculo;
        this.entrada = entrada;
        this.salida = salida;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public void setSalida(LocalDateTime salida) {
        this.salida = salida;
    }

    public long duracion() {
        return ChronoUnit.HOURS.between(this.entrada, this.salida);
    }
}
