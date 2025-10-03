public class TarifaHora implements TarifaEstrategia{
    int precioHora;

    public TarifaHora(int precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public double calcularTarifa(long duracion) {
        return this.precioHora * duracion;
    }

    //Calcular importe
}
