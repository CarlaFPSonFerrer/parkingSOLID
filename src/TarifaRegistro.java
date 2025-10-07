import java.util.HashMap;
import java.util.Map;

public class TarifaRegistro {
    private final Map<Class<? extends Vehiculo>, TarifaEstrategia> mapa = new HashMap<>();

    public <T extends Vehiculo> void registrar(Class<T> tipo, TarifaEstrategia estrategia) {
        if (tipo == null || estrategia == null) {
            throw new IllegalArgumentException("Tipo y estrategia no puede ser nulos.");
        }
        mapa.put(tipo, estrategia);
    }

    public TarifaEstrategia tarifaPara(Vehiculo vehiculo) {
        TarifaEstrategia tarifa = mapa.get(vehiculo.getClass());
        if (tarifa == null) {
            throw new IllegalStateException("No hay tarifa para " + vehiculo.nombreTipo());
        }
        return tarifa;
    }
}
