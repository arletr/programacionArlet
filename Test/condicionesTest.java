import code.Ad.ciclos.condiciones;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class condicionesTest {

    @Test
    @DisplayName("tiene 3 digitos")
    void tieneTresDigito() {
        assertTrue(condiciones.tieneTresDigitos(123));
    }

    @Test
    @DisplayName("Tu numero e")
    void esNegativo() {
        assertTrue(condiciones.esNegativo(-1));
    }

}

