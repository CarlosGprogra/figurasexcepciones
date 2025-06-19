public class CirculoDibujable extends Circulo implements figuraDibujable {

    private int x;
    private int y;
    public CirculoDibujable(double valor1, int x, int y) {
        super(valor1);
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
        g.drawOval(this.x, this.y, (int)(this.valor1), (int)(this.valor1));
    }
}