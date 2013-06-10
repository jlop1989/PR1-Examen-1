package examen1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PoligonoTest {
    private Poligono a;
    private Poligono b;
    private Poligono c;
    
    @Before
    public void initiallizeA(){
        a= new Poligono();
        assertNotNull("Error Constructor\n", a);
    }
    
    @Before
    public void initiallizeB(){
        try {
            b = new Poligono();
            b.insertaVértice(0, new Vertice(0, 0));
            b.insertaVértice(1, new Vertice(0, 1));
            assertNotNull("Error Constructor\n", b);
        } catch (Exception ex) {
            fail("Error InsertaVertice\n");
        }
    }
    
    @Before
    public void initiallizeC(){
        try {
            c = new Poligono();
            c.insertaVértice(0, new Vertice(0, 0));
            c.insertaVértice(1, new Vertice(0, 1));
            c.insertaVértice(2, new Vertice(1, 0));
            assertNotNull("Error Constructor\n", c);
        } catch (Exception ex) {
            fail("Error InsertaVertice\n");
        }
    }
    
    @Test
    public void testConstructor() {
        assertNotNull("Error Constructor\n",a);
    }
    
    @Test
    public void testNumVertA() {
        assertEquals("Error NumeroVertices\n", 0, a.númeroVértices());
    }
    
    @Test
    public void testNumVertB() {
       assertEquals("Error NumeroVertices\n", 2, b.númeroVértices());
    }
    
    @Test
    public void testNumVertC() {
        assertEquals("Error NumeroVertices\n", 3, c.númeroVértices());
    }
    
    @Test
    public void testVerticesB() {
        try {
            assertEquals("Error Vertice\n", new Vertice(0,0), b.vértice(0));
            assertEquals("Error Vertice\n", new Vertice(0,1), b.vértice(1));
        } catch (Exception ex) {
            fail("Error Vertice\n");
        }
    }
    
    @Test
    public void testVerticeC() {
       try {
            assertEquals("Error Vertice\n", new Vertice(0,0), c.vértice(0));
            assertEquals("Error Vertice\n", new Vertice(0,1), c.vértice(1));
            assertEquals("Error Vertice\n", new Vertice(1,0), c.vértice(2));
        } catch (Exception ex) {
            fail("Error Vertice\n");
        }
    }
    
    @Test
    public void testPerimetroA() {
        assertEquals("Error Perimetro\n", 0, a.perímetro());
    }
    
    @Test
    public void testPerimetroB() {
       assertEquals("Error Perimetro\n", 1, b.perímetro());
    }
    
    @Test
    public void testPerimetroC() {
        assertEquals("Error Perimetro\n", 2, c.perímetro());
    }
    
    @Test
    public void testDesplazaB() {
        try {
            b.desplaza(1, 2);
            assertEquals("Error Desplaza\n", new Vertice(1, 2),b.vértice(0));
            assertEquals("Error Desplaza\n", new Vertice(1, 3),b.vértice(1));
        } catch (Exception ex) {
            fail("Error ModificaVertice\n");
        }
    }
    
    @Test
    public void testDesplazaC() {
        try {
            c.desplaza(1, 2);
            assertEquals("Error Desplaza\n", new Vertice(1, 2),c.vértice(0));
            assertEquals("Error Desplaza\n", new Vertice(1, 3),c.vértice(1));
            assertEquals("Error Desplaza\n", new Vertice(2, 2),c.vértice(2));
        } catch (Exception ex) {
            fail("Error ModificaVertice\n");
        }
    }

}
