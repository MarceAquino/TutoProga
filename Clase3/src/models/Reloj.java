package models;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Los segundos deben estar entre 0 y 59");
        }
        this.segundo = segundo;
    }

    public void avanzarUnSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
        @Override
        public String toString () {
            return "Reloj{" +
                    "hora=" + hora +
                    ", minuto=" + minuto +
                    ", segundo=" + segundo +
                    '}';
        }
    }

