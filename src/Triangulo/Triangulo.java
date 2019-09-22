package Triangulo;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public enum TipoTrianguloAngulos {
        ACUTANGULO, OBTUSANGULO, RETANGULO;
    }

    public enum TipoTrianguloLados {
        EQUILATERO, ISOSCELES, ESCALENO;
    }

    public Triangulo(int lado01, int lado02, int lado03) {

        this.lado1 = lado01;
        this.lado2 = lado02;
        this.lado3 = lado03;
    }

    public TipoTrianguloLados getTipoLados() {

        if (!this.verificaValidade()) {
            return null;
        } else {
            if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
                return TipoTrianguloLados.ESCALENO;

            } else if (lado1 == lado2 && lado1 == lado3) {
                return TipoTrianguloLados.EQUILATERO;

            } else
                return TipoTrianguloLados.ISOSCELES;
        }
    }

    public TipoTrianguloAngulos getTipoAngulos() {
        double A, B, C;

        A = getAngleA();
        B = getAngleB();
        C = getAngleC();

        if (A < 90 && B < 90 && C < 90) {

            return TipoTrianguloAngulos.ACUTANGULO;

        } else if (A > 90 || B > 90 || C > 90) {

            return TipoTrianguloAngulos.OBTUSANGULO;

        } else if (A == 90 || B == 90 || C == 90)
            return TipoTrianguloAngulos.RETANGULO;
        else
            return null;
    }

    private double getAngleA() {
        return Math.toDegrees(Math.acos((Math.pow(lado1, 2) - Math.pow(lado2, 2) - Math.pow(lado3, 2)) / (-2 * lado2 * lado3)));
    }

    private double getAngleB() {
        return Math.toDegrees(Math.acos((Math.pow(lado2, 2) - Math.pow(lado1, 2) - Math.pow(lado3, 2)) / (-2 * lado1 * lado3)));
    }

    private double getAngleC() {
        return Math.toDegrees(Math.acos((Math.pow(lado3, 2) - Math.pow(lado1, 2) - Math.pow(lado2, 2)) / (-2 * lado2 * lado1)));
    }

    public boolean verificaValidade() {
        if (((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", Validade =" + verificaValidade() +
                ", Angulo=" + getTipoAngulos() +
                ", Lados=" + getTipoLados() +
                '}';
    }
}