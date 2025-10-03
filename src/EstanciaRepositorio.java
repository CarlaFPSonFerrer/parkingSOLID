import java.util.HashSet;
import java.util.Set;

public class EstanciaRepositorio {
    private Set<Vehiculo> vehiculos;

    public EstanciaRepositorio(Set<Vehiculo> vehiculos) {
        this.vehiculos = new HashSet<>();
    }
}
