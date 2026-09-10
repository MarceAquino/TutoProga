public class Rectangulo {
    private float area;
    private float perimetro;
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    private Punto vertice4;

    public Rectangulo(Punto vertice1, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice3 = vertice3;


        this.vertice2 = new Punto(vertice3.getX(), vertice1.getY());
        this.vertice4 = new Punto(vertice1.getX(), vertice3.getY());


        this.area = 0;
        this.perimetro = 0;
    }

    public float area() {
        if (this.area == 0) {
            float base = Math.abs(this.vertice1.getX() - this.vertice3.getX());
            float altura = Math.abs(this.vertice1.getY() - this.vertice3.getY());
            this.area = base * altura;
        }
        return this.area;
    }

    public float perimetro() {
        if (this.perimetro == 0) {
            float base = Math.abs(this.vertice1.getX() - this.vertice3.getX());
            float altura = Math.abs(this.vertice1.getY() - this.vertice3.getY());

            this.perimetro = (base + altura) / 2f;
        }
        return this.perimetro;
    }

    public Punto getVertice1() {
        return this.vertice1;
    }

    public Punto getVertice2() {
        return this.vertice2;
    }

    public Punto getVertice3() {
        return this.vertice3;
    }

    public Punto getVertice4() {
        return this.vertice4;
    }
}