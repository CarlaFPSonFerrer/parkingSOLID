import java.lang.annotation.Target;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TarifaRegistro tarifas = new TarifaRegistro();
        tarifas.registrar(Coche.class, new TarifaHora(2.0));
        tarifas.registrar(Moto.class, new TarifaHora(1.5));
        tarifas.registrar(Bicicleta.class, new TarifaHora(0.5));

        ImpresoraRecibos impresora = new ImpresoraConsola();

        ServicioParking servicio = new ServicioParking(tarifas, impresora);

        Estancia e1 = servicio.registrarEntrada(new Coche("5652KMJ"), LocalDateTime.now().minusHours(2));
        Estancia e2 = servicio.registrarEntrada(new Moto("7673MPL"), LocalDateTime.now().minusHours(3));
        Estancia e3 = servicio.registrarEntrada(new Bicicleta("BMX"), LocalDateTime.now().minusHours(5));

        servicio.registrarSalida(e1.getId(), LocalDateTime.now());
        servicio.registrarSalida(e2.getId(), LocalDateTime.now());
        servicio.registrarSalida(e3.getId(), LocalDateTime.now());


    }
}