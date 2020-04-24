import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PointTest {

    @Test
    public void test_getX(){
        Point p = new Point(3, 4);
        assertEquals(p.getX(), 3);
    }
    @Test
    public void test_setX() throws Exception {
        Point p = new Point(3, 4);
        p.setX(5);
        assertEquals(p.getX(), 5);
        assertEquals(p.getY(),4);
    }

    @Test
    public void test_getY() throws Exception {
        Point p = new Point(3, 4);
        assertEquals(p.getY(), 4);
    }

    @Test
    public void test_setY() throws Exception {
        Point p = new Point(3, 4);
        p.setY(6);
        assertEquals(p.getY(), 6);
    }

    @Test
    public void test_ToString() throws Exception {
        Point p = new Point(3, 4);

        Field fieldX = p.getClass().getDeclaredField("_x");
        Field fieldY = p.getClass().getDeclaredField("_y");

        fieldX.setAccessible(true);

        assertEquals(p.toString(), "(3, 4)");
    }

    @Test
    public void test_setName() throws Exception{
        Line p = new Line("Teste");
        p.setName("Oupa");
        assertEquals(p.getName(), "Oupa");
    }

}
