import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testIvalidCheckOfGetType() {
        Triangle triangle = new Triangle(2,1,1);
        boolean checkA = triangle.getType().equals("Invalid");

        triangle = new Triangle(1,2,1);
        boolean checkB = triangle.getType().equals("Invalid");

        triangle = new Triangle(1,1,2);
        boolean checkC = triangle.getType().equals("Invalid");

        assertTrue(checkA && checkB && checkC);
    }

    @Test
    void testEquilateralOfGetType() {
        Triangle triangle = new Triangle(1, 1, 1);

        assertEquals("equilateral", triangle.getType());
    }

    @Test
    void testIsoscelesOfGetType() {
        Triangle triangle = new Triangle(2, 2, 3);

        assertEquals("isosceles", triangle.getType());
    }

    @Test
    void testScaleneOfGetType() {
        Triangle triangle = new Triangle(2, 3, 4);

        assertEquals("scalene", triangle.getType());
    }


}