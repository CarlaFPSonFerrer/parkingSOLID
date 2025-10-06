public final class Moto implements Vehiculo{
    private String matricula;

    public Moto(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String nombreTipo() {
        return "Moto";
    }
}
