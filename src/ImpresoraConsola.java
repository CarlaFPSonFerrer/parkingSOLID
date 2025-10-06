import java.time.Duration;
import java.util.Map;

public class ImpresoraConsola implements ImpresoraRecibos{
    @Override
    public void imprimir(Recibo recibo) {
        Estancia e = recibo.getEstancia();
        Duration d = e.getDuracion();
        long horas = d.toHours();
        long minutos = d.toMinutes();

        System.out.println("=========================================");
        System.out.println("RECIBO");
        System.out.println("Vehículo: " + e.getVehiculo().nombreTipo());
        System.out.println("Entrada: " + e.getEntrada());
        System.out.println("Salida: " + e.getSalida());
        System.out.println("Duración: " + horas + ":" + minutos);
        System.out.println("Total: " + recibo.getTotal());
        System.out.println("=========================================");
    }
}
