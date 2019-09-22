package Triangulo.Teste;

import Triangulo.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTest {

    private Triangulo triangulo = new Triangulo(10,10,10);
    private Triangulo triangulo1 = new Triangulo(3, 4, 5);;
    private Triangulo triangulo2 = new Triangulo(9, 5, 4);
    private Triangulo triangulo3 = new Triangulo(4, 5, 5);


    @Test
    public void testgetTipoLados() {
        Assert.assertEquals(Triangulo.TipoTrianguloLados.EQUILATERO, triangulo.getTipoLados());
        Assert.assertEquals(Triangulo.TipoTrianguloLados.ESCALENO, triangulo1.getTipoLados());
        assertNull(triangulo2.getTipoLados());
        Assert.assertEquals(Triangulo.TipoTrianguloLados.ISOSCELES, triangulo3.getTipoLados());
    }
    @Test
    public void testgetTipoAngulos() {
        Assert.assertEquals(Triangulo.TipoTrianguloAngulos.ACUTANGULO, triangulo.getTipoAngulos());
        Assert.assertEquals(Triangulo.TipoTrianguloAngulos.RETANGULO, triangulo1.getTipoAngulos());
        Assert.assertEquals(Triangulo.TipoTrianguloAngulos.OBTUSANGULO, triangulo2.getTipoAngulos());
        Assert.assertEquals(Triangulo.TipoTrianguloAngulos.OBTUSANGULO, triangulo2.getTipoAngulos());
    }
    @Test
    public void testverificaValidade() {
        assertTrue(triangulo.verificaValidade());
        assertTrue(triangulo1.verificaValidade());
        assertFalse(triangulo2.verificaValidade());
        assertTrue(triangulo3.verificaValidade());

    }
}