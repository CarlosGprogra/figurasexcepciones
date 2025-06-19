public class TrianguloDibujable extends Figura implements figuraDibujable {
    private int x, y, base, altura;

    public TrianguloDibujable(int base, int altura, int x, int y) {
        super(base);
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    @Override
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(java.awt.Graphics g) {
        int[] xs = {x, x + base / 2, x - base / 2};
        int[] ys = {y, y + altura, y + altura};
        g.drawPolygon(xs, ys, 3);
    }

    @Override
    public double getArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public double getPerimetro() {
        double lado = Math.sqrt(Math.pow(base / 2.0, 2) + Math.pow(altura, 2));
        return base + 2 * lado;
    }
}