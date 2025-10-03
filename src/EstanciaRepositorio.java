import java.util.ArrayList;
import java.util.List;

public class EstanciaRepositorio implements EstanciaPersistencia {
    private List<Estancia> estancias;

    public EstanciaRepositorio(List<Estancia> vehiculos) {
        this.estancias = new ArrayList<>();
    }

    public List<Estancia> getVehiculos() {
        return estancias;
    }


    @Override
    public boolean agregarEstancia(Estancia estancia) {
        return estancias.add(estancia);
    }

    @Override
    public boolean eliminarEstancia(Estancia estancia) {
        return estancias.remove(estancia);
    }
}
