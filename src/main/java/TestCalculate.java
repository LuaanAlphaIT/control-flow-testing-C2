import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class TestCalculate {

    @Test
    void testGpa_APlus() {
        assertEquals("A+", Calculate.gpa(9.0));
    }

    @Test
    void testGpa_A() {
        assertEquals("A", Calculate.gpa(8.5));
    }

    @Test
    void testGpa_BPlus() {
        assertEquals("B+", Calculate.gpa(8.0));
    }

    @Test
    void testGpa_B() {
        assertEquals("B", Calculate.gpa(7.0));
    }

    @Test
    void testGpa_CPlus() {
        assertEquals("C+", Calculate.gpa(6.5));
    }

    @Test
    void testGpa_C() {
        assertEquals("C", Calculate.gpa(6.0));
    }

    @Test
    void testGpa_DPlus() {
        assertEquals("D+", Calculate.gpa(5.0));
    }

    @Test
    void testGpa_D() {
        assertEquals("D", Calculate.gpa(4.0));
    }

    @Test
    void testGpa_F() {
        assertEquals("F", Calculate.gpa(0.0));
    }

    @Test
    void testGpa_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Calculate.gpa(11.0));
    }
}
