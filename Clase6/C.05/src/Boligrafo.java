public class Boligrafo {

    private static final short CANTIDAD_MAXIMA_TINTA = 100;
    private String color;
    private short tinta;


    public Boligrafo(short tinta, String color) {
        this.color = color;
        this.tinta = 0;
        this.setTinta(tinta);
    }

    public String getColor() {
        return this.color;
    }

    public short getTinta() {
        return this.tinta;
    }

    private void setTinta(short valor) {
        int nuevoNivel = this.tinta + valor;

        if (nuevoNivel >= 0 && nuevoNivel <= CANTIDAD_MAXIMA_TINTA) {
            this.tinta = (short) nuevoNivel;
        }
    }

    public void recargar() {
        short tintaFaltante = (short) (CANTIDAD_MAXIMA_TINTA - this.tinta);
        this.setTinta(tintaFaltante);
    }

    public String pintar(short gasto) {
        if (gasto <= 0 || this.tinta == 0) {
            return "";
        }

        short tintaAGastar = (this.tinta >= gasto) ? gasto : this.tinta;
        this.setTinta((short) -tintaAGastar);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tintaAGastar; i++) {
            sb.append("*");
        }

        return sb.toString();
    }
}