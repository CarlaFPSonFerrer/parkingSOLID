import java.util.Map;

public class TarifaRepositorio {
    Map<Class, TarifaEstrategia> tarifas;

    public Map<Class, TarifaEstrategia> getTarifas() {
        return tarifas;
    }

    public void setTarifas(Map<Class, TarifaEstrategia> tarifas) {
        this.tarifas = tarifas;
    }

    public boolean addTarifa(Class tipoVehiculo, TarifaEstrategia tarifa) {
        if (tarifas.containsKey(tipoVehiculo)) {
            return false;
        }
        tarifas.put(tipoVehiculo, tarifa);
        return true;
    }
}
