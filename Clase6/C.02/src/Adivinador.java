import java.util.Random;

public class Adivinador {
    private int numeroSecreto;
    private int intentos;

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public int getIntentos() {
        return intentos;
    }

    public Adivinador() {
        Random random = new Random();
        this.numeroSecreto = random.nextInt(100)+1;
        this.intentos = 0;
    }

    public String adivinar(int numero){
        intentos++;
        String resultado;
        if (numero > numeroSecreto) {
            resultado = "MENOR";
        } else if (numero < numeroSecreto) {
            resultado = "MAYOR";
        }else{
            resultado = "IGUAL";
        }
        return resultado;
    }

    public String nivelDestreza(){
        String resultado;
        if(intentos == 1){
            resultado = "Sos perfecto";
        } else if (intentos < 5) {
            resultado = "Sos dios";
        }else if (intentos < 10){
            resultado = "Sos buenaso";
        }else{
            resultado = "jubilate";
        }
        return resultado;
    }


}
