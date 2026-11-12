
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, code.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, code.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, code.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, code.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(273.15, code.celsiusToKelvin(0), 0.001);
        assertEquals(373.15, code.celsiusToKelvin(100), 0.001);
    }

    @Test
    void testNegativeCelsius() {
        assertEquals(14.0, code.celsiusToFahrenheit(-10), 0.001);
        assertEquals(263.15, code.celsiusToKelvin(-10), 0.001);
    }

    @Test
    void testNegativeFahrenheit() {
        assertEquals(-40.0, code.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    void testAbsoluteZero() {
        assertEquals(0.0, code.celsiusToKelvin(-273.15), 0.001);
    }

    @Test
    void testInvalidKelvinBelowAbsoluteZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            code.celsiusToKelvin(-274);
        });
    }

    // INTENTIONALLY FAILING TEST CASE
    @Test
    void testIntentionalFailure() {
        assertEquals(100.0, code.celsiusToFahrenheit(0), 0.001);
    }
}
