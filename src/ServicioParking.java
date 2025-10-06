import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ServicioParking {
    public final TarifaRegistro tarifas;
    public final ImpresoraRecibos impresora;
    public final Map<UUID, Estancia> abiertas = new HashMap<>();

    public ServicioParking(TarifaRegistro tarifas, ImpresoraRecibos impresora) {
        if (tarifas == null || impresora == null) {
            throw new IllegalArgumentException("Tarifas o impresora no pueden ser nulos.");
        }
        this.tarifas = tarifas;
        this.impresora = impresora;
    }

    public Estancia registrarEntrada(Vehiculo vehiculo, LocalDateTime entrada) {
        Estancia estancia = new Estancia(vehiculo, entrada);
        abiertas.put(estancia.getId(), estancia);
        return estancia;
    }

    public Recibo registrarSalida(UUID estanciaId, LocalDateTime salida) {
        Estancia e = abiertas.remove(estanciaId);
        if (e == null) {
            throw new IllegalStateException("Estancia no encontrada.");
        }
        e.cerrar(salida);

        TarifaEstrategia tarifa = tarifas.tarifaPara(e.getVehiculo());
        double total = tarifa.calcularTarifa(e.getDuracion());

        Recibo recibo = new Recibo(e, total);
        impresora.imprimir(recibo);
        return recibo;
    }
}
