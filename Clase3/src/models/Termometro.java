package models;

public class Termometro  {
    private double temperatura;
    private boolean esCelsius;

    public Termometro(double temperaturaInicial, boolean esCelsius) {
        this.temperatura = temperaturaInicial;
        this.esCelsius = esCelsius;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public boolean isEsCelsius() {
        return esCelsius;
    }

    public void transformarACelsius() {
        if (this.esCelsius) {
            throw new IllegalStateException("El termómetro ya se encuentra en grados Celsius");
        }
        this.temperatura = (this.temperatura - 32.0) / 1.8;
        this.esCelsius = true;
    }

    public void transformarAFahrenheit() {
        if (!this.esCelsius) {
            throw new IllegalStateException("El termómetro ya se encuentra en grados Fahrenheit");
        }
        this.temperatura = (this.temperatura * 1.8) + 32.0;
        this.esCelsius = false;
    }

    public void ajustarTemperatura(double valor) {
        temperatura += valor;
    }

    @Override
    public String toString() {
        String unidad = this.esCelsius ? "°C" : "°F";
        return String.format("Termómetro: %.2f %s", this.temperatura, unidad);
    }
}
