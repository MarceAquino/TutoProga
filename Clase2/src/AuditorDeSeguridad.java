public class AuditorDeSeguridad {
    private Credencial credencial;

    public AuditorDeSeguridad(Credencial credencial) {
        this.credencial = credencial;
    }

    public boolean tieneLongitud(int minimo) {
        return credencial.getClaveSecreta().length() >= minimo;
    }

    public boolean tieneMayusculas() {
        String clave = credencial.getClaveSecreta();
        for (int i = 0; i < clave.length(); i++) {
            if (Character.isUpperCase(clave.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean tieneMinusculas() {
        String clave = credencial.getClaveSecreta();
        for (int i = 0; i < clave.length(); i++) {
            if (Character.isLowerCase(clave.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean tieneNumeros() {
        String clave = credencial.getClaveSecreta();
        for (int i = 0; i < clave.length(); i++) {
            if (Character.isDigit(clave.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public int calcularPuntajeTotal() {
        int puntaje = 0;

        if (tieneLongitud(12)) {
            puntaje = puntaje + 40;
        } else if (tieneLongitud(8)) {
            puntaje = puntaje + 20;
        }

        if (tieneMayusculas()) {
            puntaje = puntaje + 20;
        }
        if (tieneMinusculas()) {
            puntaje = puntaje + 20;
        }
        if (tieneNumeros()) {
            puntaje = puntaje + 20;
        }

        return puntaje;
    }

    public String obtenerCategoria() {
        int ptos = calcularPuntajeTotal();

        if (ptos < 40) {
            return "VULNERABLE";
        } else if (ptos < 70) {
            return "MODERADA";
        } else if (ptos < 90) {
            return "FUERTE";
        } else {
            return "NIVEL MILITAR";
        }
    }

    // Se eliminan los operadores ternarios y se usa if/else tradicional
    public void imprimirReporte() {
        System.out.println("=== REPORTE DE CIBERSEGURIDAD ===");

        if (tieneLongitud(8)) {
            System.out.println("Longitud segura: SI");
        } else {
            System.out.println("Longitud segura: NO");
        }

        if (tieneMayusculas()) {
            System.out.println("Tiene mayusculas: SI");
        } else {
            System.out.println("Tiene mayusculas: NO");
        }

        if (tieneMinusculas()) {
            System.out.println("Tiene minusculas: SI");
        } else {
            System.out.println("Tiene minusculas: NO");
        }

        if (tieneNumeros()) {
            System.out.println("Tiene numeros: SI");
        } else {
            System.out.println("Tiene numeros: NO");
        }

        System.out.println("");
        System.out.println("PUNTAJE: " + calcularPuntajeTotal() + " / 100");
        System.out.println("CATEGORIA: " + obtenerCategoria());
    }
}