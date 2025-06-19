import java.awt.Graphics;

public class CuadradoDibujable extends Figura implements figuraDibujable {
    private int x;
    private int y;

    public CuadradoDibujable(double lado, int x, int y) {
        super(lado);
        this.x = x;
        this.y = y;
    }

    @Override
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(Graphics g) {
        g.drawRect(this.x, this.y, (int)this.valor1, (int)this.valor1);
    }

    @Override
    public double getArea() {
        return valor1 * valor1;
    }

    @Override
    public double getPerimetro() {
        return 4 * valor1;
    }
}