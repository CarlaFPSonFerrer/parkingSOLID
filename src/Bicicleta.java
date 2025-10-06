public final class Bicicleta implements Vehiculo{
    private String modelo;

    public Bicicleta(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String nombreTipo() {
        return "Bicicleta";
    }
}
