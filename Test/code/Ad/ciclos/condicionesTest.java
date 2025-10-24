package code.Ad.ciclos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class condicionesTest {

    @Test
    @DisplayName("tiene 3 digitos")
    void tieneTresDigito() {
        assertTrue(condiciones.tieneTresDigitos(123));
    }
}