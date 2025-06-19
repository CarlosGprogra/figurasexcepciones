import javax.swing.*;
import java.awt.Graphics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radio = 0;
        int xCirculo = 0, yCirculo = 0;
        int lado = 0, xCuadrado = 0, yCuadrado = 0;
        int base = 0, altura = 0, xTriangulo = 0, yTriangulo = 0;

        // Métodos para pedir datos validados
        radio = pedirDoublePositivo(sc, "Radio del círculo: ");
        xCirculo = pedirIntPositivo(sc, "X del círculo: ");
        yCirculo = pedirIntPositivo(sc, "Y del círculo: ");

        lado = pedirIntPositivo(sc, "Lado del cuadrado: ");
        xCuadrado = pedirIntPositivo(sc, "X del cuadrado: ");
        yCuadrado = pedirIntPositivo(sc, "Y del cuadrado: ");

        base = pedirIntPositivo(sc, "Base del triángulo: ");
        altura = pedirIntPositivo(sc, "Altura del triángulo: ");
        xTriangulo = pedirIntPositivo(sc, "X del triángulo: ");
        yTriangulo = pedirIntPositivo(sc, "Y del triángulo: ");

        CirculoDibujable circulo = new CirculoDibujable(radio, xCirculo, yCirculo);
        CuadradoDibujable cuadrado = new CuadradoDibujable(lado, xCuadrado, yCuadrado);
        TrianguloDibujable triangulo = new TrianguloDibujable(base, altura, xTriangulo, yTriangulo);

        System.out.println("Perimetro del circulo es: " + circulo.getPerimetro());
        System.out.println("Area del circulo es: " + circulo.getArea());
        System.out.println("Perimetro del cuadrado es: " + cuadrado.getPerimetro());
        System.out.println("Area del cuadrado es: " + cuadrado.getArea());
        System.out.println("Perimetro del triangulo es: " + triangulo.getPerimetro());
        System.out.println("Area del triangulo es: " + triangulo.getArea());

        JFrame frame = new JFrame("Dibujar figuras");
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);
                triangulo.dibujar2D(g);
            }
        };

        panel.setPreferredSize(new java.awt.Dimension(400, 300));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Métodos auxiliares para validación
    public static int pedirIntPositivo(Scanner sc, String mensaje) {
        int valor = -1;
        while (true) {
            System.out.print(mensaje);
            try {
                valor = Integer.parseInt(sc.next());
                if (valor < 0) {
                    System.out.println("No se puede ingresar números negativos.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar solo números.");
            }
        }
        return valor;
    }

    public static double pedirDoublePositivo(Scanner sc, String mensaje) {
        double valor = -1;
        while (true) {
            System.out.print(mensaje);
            try {
                valor = Double.parseDouble(sc.next());
                if (valor < 0) {
                    System.out.println("No se puede ingresar números negativos.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar solo números.");
            }
        }
        return valor;
    }
}