public class Main {


    public static void mostrarDatosRectangulo(Rectangulo r) {
        System.out.println("====== DATOS DEL RECTÁNGULO ======");
        System.out.println("Vértice 1: (" + r.getVertice1().getX() + ", " + r.getVertice1().getY() + ")");
        System.out.println("Vértice 2: (" + r.getVertice2().getX() + ", " + r.getVertice2().getY() + ")");
        System.out.println("Vértice 3: (" + r.getVertice3().getX() + ", " + r.getVertice3().getY() + ")");
        System.out.println("Vértice 4: (" + r.getVertice4().getX() + ", " + r.getVertice4().getY() + ")");
        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
        System.out.println("==================================");
    }


    public static void main(String[] args) {

        Punto p1 = new Punto(2, 5);
        Punto p3 = new Punto(8, 1);

        Rectangulo miRectangulo = new Rectangulo(p1, p3);

        mostrarDatosRectangulo(miRectangulo);
    }
}