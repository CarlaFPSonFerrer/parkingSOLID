public final class Coche implements Vehiculo {
    private String matricula;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                "} " + super.toString();
    }

    @Override
    public String nombreTipo() {
        return "Coche";
    }
}
